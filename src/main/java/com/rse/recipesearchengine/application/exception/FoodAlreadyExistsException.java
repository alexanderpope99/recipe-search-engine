package com.rse.recipesearchengine.application.exception;

import lombok.Getter;

@Getter
public class FoodAlreadyExistsException extends RuntimeException {

	String foodName;

	public FoodAlreadyExistsException(String message, String name) {
		super(message);
		foodName = name;
	}

}
