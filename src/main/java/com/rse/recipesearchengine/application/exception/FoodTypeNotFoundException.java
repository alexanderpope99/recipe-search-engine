package com.rse.recipesearchengine.application.exception;

import lombok.Getter;

@Getter
public class FoodTypeNotFoundException extends RuntimeException {

	String foodType;

	public FoodTypeNotFoundException(String message, String name) {
		super(message);
		foodType = name;
	}

}
