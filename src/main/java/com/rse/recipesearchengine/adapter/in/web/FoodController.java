package com.rse.recipesearchengine.adapter.in.web;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.rse.recipesearchengine.adapter.in.web.data.response.ResponseMessage;
import com.rse.recipesearchengine.application.exception.FoodCategoryNotFoundException;
import com.rse.recipesearchengine.application.exception.FoodTypeNotFoundException;
import com.rse.recipesearchengine.application.port.in.FoodUseCase;
import com.rse.recipesearchengine.application.port.in.command.ImportFoodCommand;
import com.rse.recipesearchengine.common.WebAdapter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/food")
public class FoodController {

	private final FoodUseCase foodUseCase;

	@PostMapping(path = "/import")
	public ResponseEntity<ResponseMessage> importFood(@RequestBody @Valid ImportFoodCommand importFoodCommand) throws IOException {
		try {
			foodUseCase.importFoodFromFoodDataJSON(importFoodCommand);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Food imported successfully"));
		} catch (FoodTypeNotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage("Incorrect food type: " + e.getFoodType()));
		} catch (FoodCategoryNotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseMessage("Incorrect food category: " + e.getFoodCategory()));
		} catch (UnrecognizedPropertyException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseMessage("Invalid File"));
		}
	}

}
