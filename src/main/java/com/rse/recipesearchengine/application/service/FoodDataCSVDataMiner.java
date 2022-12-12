package com.rse.recipesearchengine.application.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rse.recipesearchengine.application.port.in.food_data_json.FoundationFoodData;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
public class FoodDataCSVDataMiner extends DataMiner<FoundationFoodData> {

	public FoodDataCSVDataMiner(@NonNull File file) {
		super(file);
	}

	@Override
	public FoundationFoodData extractData() throws IOException {
		FoundationFoodData foundationFood;

		ObjectMapper mapper = new ObjectMapper();
		foundationFood = mapper.readValue(file, FoundationFoodData.class);


		return foundationFood;
	}

}
