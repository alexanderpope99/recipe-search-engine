package com.rse.recipesearchengine.adapter.in.web;

import com.rse.recipesearchengine.application.port.in.RecipeUseCase;
import com.rse.recipesearchengine.application.port.in.command.ImportRecipeCommand;
import com.rse.recipesearchengine.common.WebAdapter;
import com.rse.recipesearchengine.domain.Recipe;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {

	private final RecipeUseCase recipeUseCase;

	@PostMapping("/extract")
	@ResponseBody
	public ResponseEntity<Recipe> extractRecipeFromURL(@RequestBody @Valid ImportRecipeCommand importRecipeCommand) {
		Recipe recipe = recipeUseCase.createRecipe(importRecipeCommand);
		return ResponseEntity.status(HttpStatus.OK).body(recipe);
	}

}
