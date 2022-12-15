package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class Recipe {

	@NonNull
	private String name;

	private List<Image> images;

	private String source;

	private String domain;

	private Double rating;

	private Long noOfReviews;

	private RecipeYield yield;

	private String description;

	private Duration prepTime;

	private Duration cookTime;

	public Duration getTotalTime() {
		return this.prepTime.plus(this.cookTime);
	}

	private String category;

	private String method;

	private String cuisine;

	private List<IngredientPart> ingredientParts;

	private List<InstructionPart> instructionParts;

	private List<Equipment> equipment;

	private List<Note> notes;

	private List<Tag> tags;

}
