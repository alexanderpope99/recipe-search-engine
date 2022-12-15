package com.rse.recipesearchengine.application.service;

import com.rse.recipesearchengine.application.port.in.RecipeUseCase;
import com.rse.recipesearchengine.application.port.in.command.ImportRecipeCommand;
import com.rse.recipesearchengine.application.service.utils.RecipeImporter;
import com.rse.recipesearchengine.application.service.utils.RecipeImporterFactory;
import com.rse.recipesearchengine.common.UseCase;
import com.rse.recipesearchengine.domain.Recipe;

@UseCase
public class RecipeService implements RecipeUseCase {

	@Override
	public Recipe createRecipe(ImportRecipeCommand importRecipeCommand) {
		String url = importRecipeCommand.getUrl();
		RecipeImporter recipeImporter = RecipeImporterFactory.buildRecipeImporter(url);

		if (recipeImporter != null)
			return recipeImporter.buildRecipe();
		else
			return null;
	}

}
