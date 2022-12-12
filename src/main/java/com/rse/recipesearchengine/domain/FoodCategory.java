package com.rse.recipesearchengine.domain;

public enum FoodCategory {

	ALCOHOLIC_BEVERAGES("Alcoholic Beverages"),
	BABY_FOOD_FORMULAS("Baby Food and Formulas"),
	BEVERAGES("Beverages"),
	CONDIMENTS_SAUCES("Condiments and Sauces"),
	FATS_OILS("Fats and Oils"),
	FRUIT("Fruit"),
	GRAINS("Grains"),
	MILK_DAIRY("Milk and Dairy"),
	MIXED_DISHES("Mixed Dishes"),
	OTHER("Other"),
	PROTEIN_FOODS("Protein Foods"),
	SNACKS_SWEETS("Snacks and Sweets"),
	SPICES_HERBS("Spices and Herbs"),
	SUGARS("Sugars"),
	VEGETABLES("Vegetables"),
	WATER("Water");

	private final String name;

	FoodCategory(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
}
