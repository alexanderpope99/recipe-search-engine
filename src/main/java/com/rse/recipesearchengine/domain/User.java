package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

@Getter
@AllArgsConstructor
public class User {

	@NonNull
	private String email;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

	@NonNull
	private String password;

	@NonNull
	private Role roles;

	private List<com.rse.recipesearchengine.domain.Collection> collections;

	private List<Equipment> equipment;

	private Pantry pantry;

	private List<ShoppingList> shoppingLists;

	private List<MealPlan> mealPlanList;

}
