package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class RecipeIngredient {

	private Ingredient ingredient;

	private Double amount;

	private IngredientUnit ingredientUnit;

	private boolean optional;

	private boolean configurable;

	private List<String> details;

}
