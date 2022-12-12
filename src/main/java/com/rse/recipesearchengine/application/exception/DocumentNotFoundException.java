package com.rse.recipesearchengine.application.exception;

import lombok.Getter;

@Getter
public class DocumentNotFoundException extends RuntimeException {

	String documentName;

	public DocumentNotFoundException(String message, String name) {
		super(message);
		documentName = name;
	}

}
