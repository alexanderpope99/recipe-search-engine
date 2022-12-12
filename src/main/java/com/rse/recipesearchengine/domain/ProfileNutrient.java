package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ProfileNutrient {

	@NonNull
	private Double quantity;

	@NonNull
	private NutrientWithUnit nutrientWithUnit;

}
