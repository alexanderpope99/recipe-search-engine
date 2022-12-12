package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class NutrientWithUnit {

	@NonNull
	private Double miligrams;

	@NonNull
	private NutrientUnit unit;

	@NonNull
	private Nutrient nutrient;

}
