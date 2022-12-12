package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodDataNutrient {

	@JsonProperty("id")
	Long id;

	@JsonProperty("number")
	String number;

	@JsonProperty("name")
	String name;

	@JsonProperty("rank")
	Long rank;

	@JsonProperty("unitName")
	String unitName;

}
