package com.rse.recipesearchengine.application.port.in;

import com.rse.recipesearchengine.application.port.in.command.ImportFoodCommand;
import com.rse.recipesearchengine.domain.Food;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FoodUseCase {

	void importFoodFromFoodDataJSON(ImportFoodCommand importFoodCommand) throws IOException;

}
