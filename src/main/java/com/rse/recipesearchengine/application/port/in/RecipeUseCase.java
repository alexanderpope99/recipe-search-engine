package com.rse.recipesearchengine.application.port.in;

import com.rse.recipesearchengine.application.port.in.command.ImportRecipeCommand;
import com.rse.recipesearchengine.domain.Recipe;

public interface RecipeUseCase {

	Recipe createRecipe(ImportRecipeCommand importRecipeCommand);

}
