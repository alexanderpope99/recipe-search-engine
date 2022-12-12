package com.rse.recipesearchengine.domain;

public enum FoodSubcategory {

	ALCOHOLIC_BEVERAGES("Alcoholic Beverages", FoodCategory.ALCOHOLIC_BEVERAGES),
	BABY_BEVERAGES("Baby Beverages", FoodCategory.BABY_FOOD_FORMULAS),
	BABY_FOODS("Baby Foods", FoodCategory.BABY_FOOD_FORMULAS),
	HUMAN_MILK("Human Milk", FoodCategory.BABY_FOOD_FORMULAS),
	INFANT_FORMULAS("Infant Formulas", FoodCategory.BABY_FOOD_FORMULAS),
	COFFEE_TEA("Coffee and Tea", FoodCategory.BEVERAGES),
	DIET_BEVERAGES("Diet Beverages", FoodCategory.BEVERAGES),
	ONE_HUNDRED_PERCENT_JUICE("100% Juice", FoodCategory.BEVERAGES),
	SWEETENED_BEVERAGES("Sweetened Beverages", FoodCategory.BEVERAGES),
	CONDIMENTS_SAUCES("Condiments and Sauces", FoodCategory.CONDIMENTS_SAUCES),
	FATS_OILS("Fats and Oils", FoodCategory.FATS_OILS),
	FRUITS("Fruits", FoodCategory.FRUIT),
	BREAD_ROLLS_TORTILLAS("Bread, Rolls, Tortillas", FoodCategory.GRAINS),
	COOKED_CEREALS("Cooked Cereals", FoodCategory.GRAINS),
	COOKED_GRAINS("Cooked Grains", FoodCategory.GRAINS),
	FLOUR("Flour", FoodCategory.GRAINS),
	OATS("Oats", FoodCategory.GRAINS),
	OTHER_GRAINS("Other grains", FoodCategory.GRAINS),
	QUICK_BREADS_BREAD_PRODUCTS("Quick Breads and Bread Products", FoodCategory.GRAINS),
	READY_TO_EAT_CEREALS("Ready-to-Eat Cereals", FoodCategory.GRAINS),
	CHEESE("Cheese", FoodCategory.MILK_DAIRY),
	DAIRY_DRINKS_SUBSTITUTES("Dairy Drinks and Substitutes", FoodCategory.MILK_DAIRY),
	FLAVORED_MILK("Flavored Milk", FoodCategory.MILK_DAIRY),
	MILK("Milk", FoodCategory.MILK_DAIRY),
	YOGURT("Yogurt", FoodCategory.MILK_DAIRY),
	ASIAN("Mixed Dishes - Asian", FoodCategory.MIXED_DISHES),
	BEAN_VEGETABLE_BASED("Mixed Dishes - Bean/Vegetable-based", FoodCategory.MIXED_DISHES),
	GRAIN_BASED("Mixed Dishes - Grain-based", FoodCategory.MIXED_DISHES),
	MEAT_POULTRY_SEAFOOD("Mixed Dishes - Meat, Poultry, Seafood", FoodCategory.MIXED_DISHES),
	MEXICAN("Mixed Dishes - Mexican", FoodCategory.MIXED_DISHES),
	PIZZA("Mixed Dishes - Pizza", FoodCategory.MIXED_DISHES),
	SANDWICHES("Mixed Dishes - Sandwiches", FoodCategory.MIXED_DISHES),
	SOUPS("Mixed Dishes - SOUPS", FoodCategory.MIXED_DISHES),
	OTHER("Other", FoodCategory.OTHER),
	CURED_MEATS_POULTRY("Cured Meats/Poultry", FoodCategory.PROTEIN_FOODS),
	EGGS("Eggs", FoodCategory.PROTEIN_FOODS),
	MEATS("Meats", FoodCategory.PROTEIN_FOODS),
	PLANT_BASED_PROTEIN("Plant-based Protein Foods", FoodCategory.PROTEIN_FOODS),
	POULTRY("Poultry", FoodCategory.PROTEIN_FOODS),
	SEAFOOD("Seafood", FoodCategory.PROTEIN_FOODS),
	CRACKERS("Crackers", FoodCategory.SNACKS_SWEETS),
	CANDY("Candy", FoodCategory.SNACKS_SWEETS),
	OTHER_DESSERTS("Other Desserts", FoodCategory.SNACKS_SWEETS),
	SAVORY_SNACKS("Savory Snacks", FoodCategory.SNACKS_SWEETS),
	SNACK_MEAL_BARS("Snack/Meal Bars", FoodCategory.SNACKS_SWEETS),
	SWEET_BAKERY_PRODUCTS("Sweet Bakery Products", FoodCategory.SNACKS_SWEETS),
	SPICES_HERBS("Spices and Herbs", FoodCategory.SPICES_HERBS),
	SUGARS("Sugars", FoodCategory.SUGARS),
	VEGETABLES("Vegetables, excluding potatoes", FoodCategory.VEGETABLES),
	WHITE_POTATOES("White Potatoes", FoodCategory.VEGETABLES),
	FLAVORED_ENHANCED_WATER("Flavored or Enhanced Water", FoodCategory.WATER),
	PLAIN_WATER("Plain Water", FoodCategory.WATER);

	private final String name;
	private final FoodCategory category;

	FoodSubcategory(String name, FoodCategory category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public FoodCategory getCategory() {
		return category;
	}

}
