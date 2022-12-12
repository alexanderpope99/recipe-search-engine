package com.rse.recipesearchengine.application.exception;

import lombok.Getter;

@Getter
public class DocumentContentNotFoundException extends RuntimeException {

	String documentName;

	public DocumentContentNotFoundException(String message, String name) {
		super(message);
		documentName = name;
	}

}
