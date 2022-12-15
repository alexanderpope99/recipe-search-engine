package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Ingredient {

	private String name;

	private String category;

	private List<Tag> tags;

	private Nutrition nutrition;
}
