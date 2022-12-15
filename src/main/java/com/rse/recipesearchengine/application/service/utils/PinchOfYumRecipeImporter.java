package com.rse.recipesearchengine.application.service.utils;

import com.rse.recipesearchengine.domain.*;
import org.jsoup.nodes.Element;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinchOfYumRecipeImporter extends RecipeImporter {

	PinchOfYumRecipeImporter(String URL) {
		this.URL = URL;
	}

	@Override
	String getName() {
		return document.select(".tasty-recipes-title").text();
	}

	@Override
	List<Image> getImages() {
		List<Image> images = new ArrayList<>();
		images.add(new Image(document.select(".tasty-pins-banner-image-link img:nth-of-type(1)")
				.attr("src")));

		document.select("figure img").forEach(element ->
				images.add(new Image(element.attr("src"))));

		return images;
	}

	@Override
	String getSource() {
		return this.URL;
	}

	@Override
	Double getRating() {
		return Double.parseDouble(document.select(".rating-label .average").text());
	}

	@Override
	Long getNoOfReviews() {
		return Long.parseLong(document.select(".rating-label .count").text());
	}

	@Override
	RecipeYield getYield() {
		return new RecipeYield(Double.parseDouble(
				document.select(".tasty-recipes-yield span:nth-of-type(1)")
						.attr("data-amount")),
				document.select(".tasty-recipes-yield").
						text().split(" ")[1]);
	}

	@Override
	String getDescription() {
		return document.select(".tasty-recipes-description-body p:nth-of-type(1)")
				.text();
	}

	@Override
	Duration getPrepTime() {
		return this.convertToDuration(document.select(".tasty-recipes-prep-time").text());
	}

	@Override
	Duration getCookTime() {
		return this.convertToDuration(document.select(".tasty-recipes-cook-time").text());
	}

	@Override
	String getCategory() {
		return document.select(".tasty-recipes-category").text();
	}

	@Override
	String getMethod() {
		return document.select(".tasty-recipes-method").text();
	}

	@Override
	String getCuisine() {
		return document.select(".tasty-recipes-cuisine").text();
	}


	List<String> getDetailsForRecipeIngredient(String text) {
		Matcher m = Pattern.compile("\\((.*?)\\)").matcher(text);
		List<String> details = new ArrayList<>();

		while (m.find()) {
			if (!m.group(1).equals("optional"))
				details.add(m.group(1));
		}

		for (int i = 1; i < text.split(",").length; i++)
			details.add(text.split(",")[i].trim());

		for (int i = 1; i < text.split("–").length; i++)
			details.add(text.split("–")[i].trim());

		return details;
	}

	boolean getRecipeOptionality(String text) {
		return text.contains("optional");
	}

	@Override
	List<RecipeIngredient> getRecipeIngredient(Element element) {
		List<RecipeIngredient> recipeIngredients = new ArrayList<>();

		if (element.select(".nutrifox-quantity").size() > 0) {
			Double amount = Double.parseDouble(element.select(".nutrifox-quantity").attr("data-amount"));
			String unitName = element.select(".nutrifox-quantity").attr("data-unit");
			String ingredientName = element.select(".nutrifox-quantity").attr("data-nf-food-description");
			Ingredient ingredient = new Ingredient(ingredientName, null, null, null);
			IngredientUnit ingredientUnit = new IngredientUnit(unitName, 0d);

			List<String> details = getDetailsForRecipeIngredient(element.text());
			boolean optional = getRecipeOptionality(element.text());

			recipeIngredients.add(new RecipeIngredient(ingredient, amount, ingredientUnit, optional, false, details));

		} else {

			String amountAndUnit = element.select("span:nth-of-type(2)").text();

			String unitName = getUnitFromText(amountAndUnit);

			Double amount;
			String amountText;
			if (unitName != null) {
				amountText = amountAndUnit.replace(unitName + "s", "").trim();
				amountText = amountText.replace(unitName, "").trim();
			} else {
				amountText = amountAndUnit;
			}

			try {
				if (amountText.contains("/"))
					amount = Double.parseDouble(amountText.split("/")[0]) / Double.parseDouble(amountText.split("/")[1]);
				else
					amount = Double.parseDouble(amountText);
			} catch (NumberFormatException e) {
				amount = getAmountFromText(element.text());
			}

			String ingredientName = element.select("strong").text();

			if (amount == null)
				try {
					amount = Double.parseDouble(element.select("span:nth-of-type(2)").attr("data-amount"));
				} catch (NumberFormatException ignored) {
				}

			if (unitName == null) {
				if (!ingredientName.isEmpty())
					unitName = ingredientName;
				else unitName = "cup";
			}

			if (ingredientName.isEmpty()) {
				ingredientName = element.select(":nth-child(2)").text();
			}

			if (ingredientName.equals(unitName))
				unitName = "piece";

			boolean configurable = amount == null;

			Ingredient ingredient = new Ingredient(ingredientName, null, null, null);
			IngredientUnit ingredientUnit = new IngredientUnit(unitName, 0d);

			List<String> details = getDetailsForRecipeIngredient(element.text());

			String fullText = element.text();
			fullText = fullText.replace(unitName + "s", "");
			fullText = fullText.replace(unitName, "");
			fullText = fullText.replace(amountText, "");
			if (amountText.isEmpty())
				fullText = fullText.replace(getTextFromAmount(amount), "");
			fullText = fullText.replace(ingredientName, "");
			fullText = replacePrepositions(fullText);
			fullText = fullText.trim()
					.replaceAll(" +", " ")
					.replaceAll("&" + "nbsp;", "")
					.replaceAll(String.valueOf((char) 160), "")
					.trim();

			for (String detail : details)
				fullText = fullText.replace(detail, "").trim();

			if (!fullText.isEmpty())
				details.add(fullText);

			boolean optional = getRecipeOptionality(element.text());

			recipeIngredients.add(new RecipeIngredient(ingredient, amount, ingredientUnit, optional, configurable, details));
		}

		return recipeIngredients;
	}

	@Override
	List<IngredientPart> getIngredientParts() {

		List<IngredientPart> ingredientParts = new ArrayList<>();

		List<Element> elements = document.select(".tasty-recipes-ingredients div:nth-of-type(2) ul");

		for (int i = 0; i < elements.size(); i++) {
			List<RecipeIngredient> recipeIngredients = new ArrayList<>();

			for (Element element : elements.get(i).select("li")) {
				recipeIngredients.addAll(getRecipeIngredient(element));
			}

			ingredientParts.add(new IngredientPart(
					document.select(".tasty-recipes-ingredients div:nth-of-type(2) p:nth-of-type(" + (i + 1) + ") strong").text(), recipeIngredients));
		}
		return ingredientParts;
	}

	@Override
	List<InstructionPart> getInstructionParts() {
		List<InstructionPart> instructionParts = new ArrayList<>();

		List<Instruction> instructions = new ArrayList<>();

		List<Element> elements = document.select(".tasty-recipes-instructions div:nth-of-type(2) ol li");

		for (int i = 0; i < elements.size(); i++) {

			String title = elements.get(i).select("strong").text();
			String description = elements.get(i).text();
			if (!title.isEmpty() && description.contains(title))
				description = description.replace(title + " ", "");

			instructions.add(new Instruction(i + 1, title, description, null));
		}
		InstructionPart instructionPart = new InstructionPart(null, instructions);

		instructionParts.add(instructionPart);

		return instructionParts;
	}

	@Override
	List<Equipment> getEquipmentList() {

		List<Equipment> equipment = new ArrayList<>();

		for (Element element : document.select(".tasty-recipes-equipment article"))
			equipment.add(new Equipment(
					element.select("p a").text(),
					new Image(element.select("a img").attr("src")),
					element.select("p a").attr("href"))
			);

		return equipment;
	}

	@Override
	List<Note> getNotes() {
		List<Note> notes = new ArrayList<>();

		List<Element> elements = document.select(".tasty-recipes-notes-body p");
		for (int i = 0; i < elements.size(); i++)
			notes.add(new Note(i + 1, elements.get(i).text()));

		return notes;
	}

	@Override
	List<Tag> getTags() {
		return null;
	}

}
