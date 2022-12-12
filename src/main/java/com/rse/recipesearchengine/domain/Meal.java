package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Meal {

	@NonNull
	private Recipe recipe;

	@NonNull
	private Double servings;

}
