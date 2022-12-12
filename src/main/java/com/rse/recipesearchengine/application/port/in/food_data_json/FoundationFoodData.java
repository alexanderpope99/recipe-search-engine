package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FoundationFoodData {

	@JsonProperty("FoundationFoods")
	List<FoodDataFood> foundationFoodDataFoods = new ArrayList<>();

	@JsonProperty("SurveyFoods")
	List<FoodDataFood> surveyFoodDataFoods = new ArrayList<>();

	@JsonProperty("SRLegacyFoods")
	List<FoodDataFood> srLegacyFoodDataFoods = new ArrayList<>();

}
