package com.rse.recipesearchengine.application.exception;

import lombok.Getter;

@Getter
public class FoodCategoryNotFoundException extends RuntimeException {

	String foodCategory;

	public FoodCategoryNotFoundException(String message, String name) {
		super(message);
		foodCategory = name;
	}

}
