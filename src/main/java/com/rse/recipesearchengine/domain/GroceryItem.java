package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class GroceryItem {

	@NonNull
	private Double quantity;

	private LocalDateTime expiryDateTime;

	private FoodPortion foodPortion;

}
