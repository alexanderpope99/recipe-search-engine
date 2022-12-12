package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class RecipeFood {

	@NonNull
	private Double quantity;

	@NonNull
	private FoodPortion foodPortion;

}
