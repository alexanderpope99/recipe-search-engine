package com.rse.recipesearchengine.application.service.utils;

public class RecipeImporterFactory {

	public static RecipeImporter buildRecipeImporter(String url) {
		String comparableLink = url.toLowerCase();
		if (comparableLink.contains("pinchofyum"))
			return new PinchOfYumRecipeImporter(url);
		else
			return null;
	}

}
