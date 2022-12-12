package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FoodAtribute {

	@JsonProperty("id")
	String id;

	@JsonProperty("name")
	String name;

	@JsonProperty("value")
	String value;

	@JsonProperty("foodAttributeType")
	FoodAtributeType foodAttributeType;

	@JsonProperty("rank")
	Long rank;

	@JsonProperty("unitName")
	String unitName;

}
