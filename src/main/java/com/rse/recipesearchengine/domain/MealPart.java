package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class MealPart {

	@NonNull
	private String name;

	private LocalTime time;

	private List<Meal> meals;
}
