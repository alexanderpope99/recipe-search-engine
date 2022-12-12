package com.rse.recipesearchengine.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

@Getter
@Builder
public class Food {

	@NonNull
	private String name;

	private String description;

	@NonNull
	private FoodType type;

	private FoodGroup group;

	private FoodSubcategory subcategory;

	private String brand;

	private String source;

	private List<Image> images;

	private List<FoodPortion> foodPortions;

	private NutritionalProfile nutrition;

	private List<String> otherIngredients;

}
