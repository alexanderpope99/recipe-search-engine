package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Collection {

	@NonNull
	private String collection;

	@NonNull
	private ItemVisibility visibility;

	private List<Recipe> recipes;

}
