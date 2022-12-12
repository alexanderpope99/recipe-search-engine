package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class RecipePart {

	private String name;

	private String description;

	private List<RecipeFood> recipeFoodList;

}
