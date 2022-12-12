package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InputFoodDescription {

	@JsonProperty("id")
	String id;

	@JsonProperty("foodDescription")
	String foodDescription;

	@JsonProperty("inputFood")
	InputFood inputFood;

	@JsonProperty("unit")
	String unit;

	@JsonProperty("portionDescription")
	String portionDescription;

	@JsonProperty("portionCode")
	String portionCode;

	@JsonProperty("sequenceNumber")
	Integer sequenceNumber;

	@JsonProperty("ingredientDescription")
	String ingredientDescription;

	@JsonProperty("ingredientWeight")
	Integer ingredientWeight;

	@JsonProperty("amount")
	Integer amount;

	@JsonProperty("ingredientCode")
	Long ingredientCode;

}
