package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class ShoppingList {

	private List<GroceryItem> groceries;

	@NonNull
	private ShoppingListStatus status;

	@NonNull
	private LocalDate startedOn;

	private LocalDate finishedOn;

	private Double price;

}
