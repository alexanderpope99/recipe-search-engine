package com.rse.recipesearchengine.adapter.in.web.data.response;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ResponseMessage {

	@NonNull
	private String message;

}
