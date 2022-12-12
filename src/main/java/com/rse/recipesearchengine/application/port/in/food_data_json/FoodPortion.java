package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodPortion {

	@JsonProperty("id")
	Long id;

	@JsonProperty("modifier")
	String modifier;

	@JsonProperty("gramWeight")
	Double gramWeight;

	@JsonProperty("sequenceNumber")
	Integer sequenceNumber;

	@JsonProperty("minYearAcquired")
	Long minYearAcquired;

	@JsonProperty("measureUnit")
	MeasureUnit measureUnit;

	@JsonProperty("portionDescription")
	String portionDescription;

	@JsonProperty("amount")
	Double amount;

}
