package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class FoodPortion {

	@NonNull
	private FoodUnit unit;

	@NonNull
	private Double grams;

}
