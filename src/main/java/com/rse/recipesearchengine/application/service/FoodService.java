package com.rse.recipesearchengine.application.service;

import com.rse.recipesearchengine.application.event.FoodImportedEvent;
import com.rse.recipesearchengine.application.exception.FoodAlreadyExistsException;
import com.rse.recipesearchengine.application.port.in.FoodUseCase;
import com.rse.recipesearchengine.application.port.in.command.ImportFoodCommand;
import com.rse.recipesearchengine.application.port.in.food_data_json.FoodDataFood;
import com.rse.recipesearchengine.application.port.in.food_data_json.FoundationFoodData;
import com.rse.recipesearchengine.application.port.out.ExceptionEventPublisher;
import com.rse.recipesearchengine.application.port.out.FoodEventPublisher;
import com.rse.recipesearchengine.application.port.out.FoodStorage;
import com.rse.recipesearchengine.common.UseCase;
import com.rse.recipesearchengine.domain.*;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@UseCase
@AllArgsConstructor
public class FoodService implements FoodUseCase {

	private final FoodStorage foodStorage;

	private final FoodEventPublisher foodEventPublisher;

	private final ExceptionEventPublisher exceptionEventPublisher;

	private final DocumentService documentService;

	public void addFoodFromFoodDataFoodList(List<FoodDataFood> foodDataFoodList) {
		for (FoodDataFood foodDataFood : foodDataFoodList) {
			FoodType foodType = FoodType.of(foodDataFood.getDataType());

			String category;
			if (foodDataFood.getFoodCategory() == null)
				category = foodDataFood.getWweiaFoodCategory().getWweiaFoodCategoryDescription();
			else
				category = foodDataFood.getFoodCategory().getDescription();

			FoodGroup foodGroup;
			try {
				if (foodType.equals(FoodType.SURVEY) && !category.equals("Not included in a food category"))
					foodGroup = FoodGroup.of(category);
				else
					foodGroup = FoodGroup.findGroup(foodDataFood.getDescription(), category);
			} catch (IllegalArgumentException ex) {
				exceptionEventPublisher.publishException(ex);
				continue;
			}

			List<FoodPortion> foodPortions = new ArrayList<>();

			for (com.rse.recipesearchengine.application.port.in.food_data_json.FoodPortion foodPortion : foodDataFood.getFoodPortions()) {
				foodPortions.add(new FoodPortion(FoodUnit.of(foodPortion.getMeasureUnit().getName()), foodPortion.getGramWeight()));
			}

			Food food = Food.builder()
					.name(foodDataFood.getDescription())
					.type(foodType)
					.group(foodGroup)
					.foodPortions(foodPortions)
					.build();

			try {
				foodStorage.save(food);
			} catch (FoodAlreadyExistsException ex) {
				exceptionEventPublisher.publishException(ex);
				continue;
			}

			foodEventPublisher.publishFoodImportedEvent(new FoodImportedEvent(food));
		}
	}

	@Override
	public void importFoodFromFoodDataJSON(ImportFoodCommand importFoodCommand) throws IOException {
		FoodDataJSONDataMiner foodDataJSONDataMiner = new FoodDataJSONDataMiner(
				documentService.load(importFoodCommand.getFilename()).getFile()
		);
		FoundationFoodData foundationFoodData = foodDataJSONDataMiner.extractData();

		addFoodFromFoodDataFoodList(foundationFoodData.getFoundationFoodDataFoods());
		addFoodFromFoodDataFoodList(foundationFoodData.getSurveyFoodDataFoods());
		addFoodFromFoodDataFoodList(foundationFoodData.getSrLegacyFoodDataFoods());
	}

}
