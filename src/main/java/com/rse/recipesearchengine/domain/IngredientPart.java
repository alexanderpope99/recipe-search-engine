package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class IngredientPart {

	private String title;

	private List<RecipeIngredient> recipeIngredients;

}
