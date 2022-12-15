package com.rse.recipesearchengine.application.service.utils;

import com.rse.recipesearchengine.domain.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class RecipeImporter {

	protected String URL;

	protected Document document;

	Duration convertToDuration(String text) {
		if (text.isEmpty())
			return Duration.ofSeconds(0);
		text = text.replace("mins", "M");
		text = text.replace("minutes", "M");
		String[] textParts = text.split(" ");
		String convertedText = textParts[0] + textParts[1];
		return Duration.parse("PT" + convertedText.replaceAll("\\s", ""));
	}

	abstract String getName();

	abstract List<Image> getImages();

	abstract String getSource();

	String replacePrepositions(String text) {
		text = text.replace("of", "");
		text = text.replace(",", "");
		text = text.replace("(", "");
		text = text.replace(")", "");
		text = text.replace("–", "");
		return text;
	}

	Double getAmountFromText(String text) {
		Map<String, Double> amounts = new HashMap<>();
		amounts.put("one", 1d);
		amounts.put("two", 2d);
		amounts.put("three", 3d);
		amounts.put("four", 4d);

		for (String amount : amounts.keySet())
			if (text.contains(amount))
				return amounts.get(amount);

		return null;
	}

	String getTextFromAmount(Double amount) {
		Map<Double, String> amounts = new HashMap<>();
		amounts.put(1d, "one");
		amounts.put(2d, "two");
		amounts.put(3d, "three");
		amounts.put(4d, "four");

		for (Double amountToCheck : amounts.keySet())
			if (Objects.equals(amount, amountToCheck))
				return amounts.get(amount);

		return "";
	}

	String getUnitFromText(String text) {
		List<String> units = List.of("cup", "teaspoon", "grams", "tablespoon");

		for (String unit : units)
			if (text.contains(unit))
				return unit;

		return null;
	}

	String getDomain() {
		Matcher m = Pattern.compile("^(?:https?:\\/\\/)?(?:[^@\\/\\n]+@)?(?:www\\.)?([^:\\/?\\n]+)")
				.matcher(getSource());
		if (m.find()) {
			return m.group(1);
		}
		return null;
	}

	abstract Double getRating();

	abstract Long getNoOfReviews();

	abstract RecipeYield getYield();

	abstract String getDescription();

	abstract Duration getPrepTime();

	abstract Duration getCookTime();

	abstract String getCategory();

	abstract String getMethod();

	abstract String getCuisine();

	abstract List<RecipeIngredient> getRecipeIngredient(Element element);

	abstract List<IngredientPart> getIngredientParts();

	abstract List<InstructionPart> getInstructionParts();

	abstract List<Equipment> getEquipmentList();

	abstract List<Note> getNotes();

	abstract List<Tag> getTags();

	public Recipe buildRecipe() {
		try {
			document = Jsoup.connect(URL).get();

			return Recipe.builder()
					.name(this.getName())
					.images(this.getImages())
					.source(this.getSource())
					.domain(this.getDomain())
					.rating(this.getRating())
					.noOfReviews(this.getNoOfReviews())
					.yield(this.getYield())
					.description(this.getDescription())
					.prepTime(this.getPrepTime())
					.cookTime(this.getCookTime())
					.category(this.getCategory())
					.method(this.getMethod())
					.cuisine(this.getCuisine())
					.ingredientParts(this.getIngredientParts())
					.instructionParts(this.getInstructionParts())
					.equipment(this.getEquipmentList())
					.notes(this.getNotes())
					.tags(this.getTags())
					.build();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
