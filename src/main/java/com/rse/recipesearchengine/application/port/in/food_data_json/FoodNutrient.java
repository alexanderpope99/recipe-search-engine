package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodNutrient {

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	Long id;

	@JsonProperty("nutrient")
	FoodDataNutrient nutrient;

	@JsonProperty("dataPoints")
	Integer dataPoints;

	@JsonProperty("max")
	Double max;

	@JsonProperty("min")
	Double min;

	@JsonProperty("median")
	Double median;

	@JsonProperty("amount")
	Double amount;

	@JsonProperty("foodNutrientDerivation")
	FoodNutrientDerivation foodNutrientDerivation;

	@JsonProperty("footnote")
	String footnote;

}
