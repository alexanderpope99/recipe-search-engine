package com.rse.recipesearchengine.adapter.in.web.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FileUploadResponse {

	private String message;

	private String filename;

	private String url;
}
