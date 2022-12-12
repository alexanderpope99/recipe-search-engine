package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NutrientConversionFactor {

	@JsonProperty("type")
	String type;

	@JsonProperty("proteinValue")
	Double proteinValue;

	@JsonProperty("fatValue")
	Double fatValue;

	@JsonProperty("carbohydrateValue")
	Double carbohydrateValue;

	@JsonProperty("nitrogenValue")
	Double nitrogenValue;

	@JsonProperty("value")
	Double value;

}
