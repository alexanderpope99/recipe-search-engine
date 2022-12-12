package com.rse.recipesearchengine.application.port.in.food_data_json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FoodDataFood {

	@JsonProperty("foodClass")
	String foodClass;

	@JsonProperty("description")
	String description;

	@JsonProperty("foodNutrients")
	List<FoodNutrient> foodNutrients;

	@JsonProperty("foodAttributes")
	List<FoodAtribute> foodAttributes;

	@JsonProperty("nutrientConversionFactors")
	List<NutrientConversionFactor> nutrientConversionFactors;

	@JsonProperty("isHistoricalReference")
	Boolean isHistoricalReference;

	@JsonProperty("ndbNumber")
	Long ndbNumber;

	@JsonProperty("foodPortions")
	List<FoodPortion> foodPortions;

	@JsonProperty("publicationDate")
	String publicationDate;

	@JsonProperty("inputFoods")
	List<InputFoodDescription> inputFoodDescriptions;

	@JsonProperty("fdcId")
	Long fdcId;

	@JsonProperty("dataType")
	String dataType;

	@JsonProperty("foodCategory")
	FoodCategory foodCategory;

	@JsonProperty("scientificName")
	String scientificName;

	@JsonProperty("foodCode")
	String foodCode;

	@JsonProperty("startDate")
	String startDate;

	@JsonProperty("endDate")
	String endDate;

	@JsonProperty("wweiaFoodCategory")
	WweiaFoodCategory wweiaFoodCategory;

}
