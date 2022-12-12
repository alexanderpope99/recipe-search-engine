package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MeasureUnit {

	@JsonProperty("id")
	Long id;

	@JsonProperty("name")
	String name;

	@JsonProperty("abbreviation")
	String abbreviation;

}
