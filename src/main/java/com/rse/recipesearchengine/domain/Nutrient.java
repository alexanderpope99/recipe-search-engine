package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Nutrient {

	@NonNull
	private String name;

	private String description;

	@NonNull
	private NutrientType nutrientType;

}
