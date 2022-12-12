package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InputFood {

	@JsonProperty("foodClass")
	String foodClass;

	@JsonProperty("description")
	String description;

	@JsonProperty("publicationDate")
	String publicationDate;

	@JsonProperty("fdcId")
	Long fdcId;

	@JsonProperty("dataType")
	String dataType;

	@JsonProperty("foodCategory")
	FoodCategory foodCategory;

}
