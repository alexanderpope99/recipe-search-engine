package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodNutrientDerivation {

	@JsonProperty("code")
	String code;

	@JsonProperty("description")
	String description;

	@JsonProperty("foodNutrientSource")
	FoodNutrientSource foodNutrientSource;
}
