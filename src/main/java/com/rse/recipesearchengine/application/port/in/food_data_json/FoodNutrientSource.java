package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodNutrientSource {

	@JsonProperty("id")
	Integer id;

	@JsonProperty("code")
	String code;

	@JsonProperty("description")
	String description;

}
