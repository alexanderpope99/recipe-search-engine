package com.rse.recipesearchengine.domain;

import java.util.HashMap;
import java.util.Map;

public enum FoodGroup {

	BEER("Beer", FoodSubcategory.ALCOHOLIC_BEVERAGES),
	LIQUOR_COCKTAILS("Liquor and cocktails", FoodSubcategory.ALCOHOLIC_BEVERAGES),
	WINE("Wine", FoodSubcategory.ALCOHOLIC_BEVERAGES),
	BABY_JUICE("Baby juice", FoodSubcategory.BABY_BEVERAGES),
	BABY_WATER("Baby water", FoodSubcategory.BABY_BEVERAGES),
	BABY_FOOD_CEREALS("Baby food: cereals", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_FRUIT("Baby food: fruit", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_MEAT_DINNERS("Baby food: meat and dinners", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_MIXTURES("Baby food: mixtures", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_SNACKS_SWEETS("Baby food: snacks and sweets", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_VEGETABLE("Baby food: vegetable", FoodSubcategory.BABY_FOODS),
	BABY_FOOD_YOGURT("Baby food: yogurt", FoodSubcategory.BABY_FOODS),
	HUMAN_MILK("Human milk", FoodSubcategory.HUMAN_MILK),
	FORMULA_READY_TO_FEED("Formula, ready-to-feed", FoodSubcategory.INFANT_FORMULAS),
	FORMULA_PREPARED_POWDER("Formula, prepared from powder", FoodSubcategory.INFANT_FORMULAS),
	COFFEE("Coffee", FoodSubcategory.COFFEE_TEA),
	TEA("Tea", FoodSubcategory.COFFEE_TEA),
	DIET_SOFT_DRINKS("Diet soft drinks", FoodSubcategory.DIET_BEVERAGES),
	DIET_SPORTS_ENERGY_DRINKS("Diet sport and energy drinks", FoodSubcategory.DIET_BEVERAGES),
	OTHER_DIET_DRINKS("Other diet drinks", FoodSubcategory.DIET_BEVERAGES),
	APPLE_JUICE("Apple juice", FoodSubcategory.ONE_HUNDRED_PERCENT_JUICE),
	CITRUS_JUICE("Citrus juice", FoodSubcategory.ONE_HUNDRED_PERCENT_JUICE),
	OTHER_FRUIT_JUICE("Other fruit juice", FoodSubcategory.ONE_HUNDRED_PERCENT_JUICE),
	VEGETABLE_JUICE("Vegetable juice", FoodSubcategory.ONE_HUNDRED_PERCENT_JUICE),
	FRUIT_DRINKS("Fruit drinks", FoodSubcategory.SWEETENED_BEVERAGES),
	NUTRITIONAL_BEVERAGES("Nutritional beverages", FoodSubcategory.SWEETENED_BEVERAGES),
	SMOOTHIES_AND_GRAIN_DRINKS("Smoothies and grain drinks", FoodSubcategory.SWEETENED_BEVERAGES),
	SOFT_DRINKS("Soft drinks", FoodSubcategory.SWEETENED_BEVERAGES),
	SPORT_ENERGY_DRINKS("Sport and energy drinks", FoodSubcategory.SWEETENED_BEVERAGES),
	DIPS_GRAVIES_OTHER_SAUCES("Dips, gravies, other sauces", FoodSubcategory.CONDIMENTS_SAUCES),
	MUSTARD_OTHER_CONDIMENTS("Mustard and other condiments", FoodSubcategory.CONDIMENTS_SAUCES),
	OLIVES_PICKLES_PICKLED_VEGETABLES("Olives, pickles, pickled vegetables", FoodSubcategory.CONDIMENTS_SAUCES),
	PASTA_SAUCES("Pasta sauces, tomato-based", FoodSubcategory.CONDIMENTS_SAUCES),
	SOY_BASED_CONDIMENTS("Soy-based condiments", FoodSubcategory.CONDIMENTS_SAUCES),
	TOMATO_BASED_CONDIMENTS("Tomato-based condiments", FoodSubcategory.CONDIMENTS_SAUCES),
	BUTTER_ANIMAL_FATS("Butter and animal fats", FoodSubcategory.FATS_OILS),
	CREAM_CREAM_SUBSTITUTES("Cream and cream substitutes", FoodSubcategory.FATS_OILS),
	CREAM_CHEESE_SOUR_CREAM_WHIPPED_CREAM("Cream cheese, sour cream, whipped cream", FoodSubcategory.FATS_OILS),
	MARGARINE("Margarine", FoodSubcategory.FATS_OILS),
	MAYONNAISE("Mayonnaise", FoodSubcategory.FATS_OILS),
	SALAD_DRESSINGS_VEGETABLE_OILS("Salad dressings and vegetable oils", FoodSubcategory.FATS_OILS),
	APPLES("Apples", FoodSubcategory.FRUITS),
	BANANAS("Bananas", FoodSubcategory.FRUITS),
	BLUEBERRIES_OTHER_BERRIES("Blueberries and other berries", FoodSubcategory.FRUITS),
	CITRUS_FRUITS("Citrus fruits", FoodSubcategory.FRUITS),
	DRIED_FRUITS("Dried fruits", FoodSubcategory.FRUITS),
	GRAPES("Grapes", FoodSubcategory.FRUITS),
	MANGO_PAPAYA("Mango and papaya", FoodSubcategory.FRUITS),
	MELONS("Melons", FoodSubcategory.FRUITS),
	OTHER_FRUITS_FRUIT_SALADS("Other fruits and fruit salads", FoodSubcategory.FRUITS),
	PEACHES_NECTARINES("Peaches and nectarines", FoodSubcategory.FRUITS),
	PEARS("Pears", FoodSubcategory.FRUITS),
	PINEAPPLE("Pineapple", FoodSubcategory.FRUITS),
	STRAWBERRIES("Strawberries", FoodSubcategory.FRUITS),
	BAGELS_MUFFINS("Bagels and English muffins", FoodSubcategory.BREAD_ROLLS_TORTILLAS),
	ROLLS_BUNS("Rolls and buns", FoodSubcategory.BREAD_ROLLS_TORTILLAS),
	TORTILLAS("Tortillas", FoodSubcategory.BREAD_ROLLS_TORTILLAS),
	YEAST_BREADS("Yeast breads", FoodSubcategory.BREAD_ROLLS_TORTILLAS),
	GRITS_OTHER_COOKED_CEREALS("Grits and other cooked cereals", FoodSubcategory.COOKED_CEREALS),
	OATMEAL("Oatmeal", FoodSubcategory.COOKED_CEREALS),
	PASTA_NOODLES_COOKED_GRAINS("Pasta, noodles, cooked grains", FoodSubcategory.COOKED_GRAINS),
	RICE("Rice", FoodSubcategory.COOKED_GRAINS),
	FLOUR("Flour", FoodSubcategory.FLOUR),
	OATS("Oats", FoodSubcategory.OATS),
	OTHER_GRAINS("Other grains", FoodSubcategory.OTHER_GRAINS),
	BISCUITS_MUFFINS_QUICK_BREADS("Biscuits, muffins, quick breads", FoodSubcategory.QUICK_BREADS_BREAD_PRODUCTS),
	RTE_CEREAL_HIGHER_SUGAR("Ready-to-eat cereal, higher sugar (>21.2g/100g)", FoodSubcategory.READY_TO_EAT_CEREALS),
	RTE_CEREAL_LOWER_SUGAR("Ready-to-eat cereal, lower sugar (=<21.2g/100g)", FoodSubcategory.READY_TO_EAT_CEREALS),
	PANCAKES_WAFFLES_FRENCH_TOAST("Pancakes, waffles, French toast", FoodSubcategory.QUICK_BREADS_BREAD_PRODUCTS),
	CHEESE("Cheese", FoodSubcategory.CHEESE),
	COTTAGE_RICOTTA("Cottage/ricotta cheese", FoodSubcategory.CHEESE),
	MILK_SHAKES_OTHER_DAIRY_DRINKS("Milk shakes and other dairy drinks", FoodSubcategory.DAIRY_DRINKS_SUBSTITUTES),
	MILK_SUBSTITUTES("Milk substitutes", FoodSubcategory.DAIRY_DRINKS_SUBSTITUTES),
	FLAVORED_MILK_LOWFAT("Flavored milk, lowfat", FoodSubcategory.FLAVORED_MILK),
	FLAVORED_MILK_NONFAT("Flavored milk, nonfat", FoodSubcategory.FLAVORED_MILK),
	FLAVORED_MILK_REDUCED_FAT("Flavored milk, reduced fat", FoodSubcategory.FLAVORED_MILK),
	FLAVORED_MILK_WHOLE("Flavored milk, whole", FoodSubcategory.FLAVORED_MILK),
	MILK_LOWFAT("Milk, lowfat", FoodSubcategory.MILK),
	MILK_NONFAT("Milk, nonfat", FoodSubcategory.MILK),
	MILK_REDUCED_FAT("Milk, reduced fat", FoodSubcategory.MILK),
	MILK_WHOLE("Milk, whole", FoodSubcategory.MILK),
	YOGURT_REGULAR("Yogurt, regular", FoodSubcategory.YOGURT),
	YOGURT_GREEK("Yogurt, Greek", FoodSubcategory.YOGURT),
	EGG_ROLLS_DUMPLINGS_SUSHI("Egg rolls, dumplings, sushi", FoodSubcategory.ASIAN),
	FRIED_RICE_LOCHOW_MEIN("Fried rice and lo/chow mein", FoodSubcategory.ASIAN),
	STIR_FRY_SOY_BASED_MIXTURES("Stir-fry and soy-based sauce mixtures", FoodSubcategory.ASIAN),
	BEAN_PEA_LEGUME_DISHES("Bean, pea, legume dishes", FoodSubcategory.BEAN_VEGETABLE_BASED),
	VEGETABLE_DISHES("Vegetable dishes", FoodSubcategory.BEAN_VEGETABLE_BASED),
	MACARONI_CHEESE("Macaroni and cheese", FoodSubcategory.GRAIN_BASED),
	PASTA_MIXED_DISHES("Pasta mixed dishes, excludes macaroni and cheese", FoodSubcategory.GRAIN_BASED),
	RICE_MIXED_DISHES("Rice mixed dishes", FoodSubcategory.GRAIN_BASED),
	TURNOVERS_OTHER_GRAIN("Turnovers and other grain-based items", FoodSubcategory.GRAIN_BASED),
	MEAT_MIXED_DISHES("Meat mixed dishes", FoodSubcategory.MEAT_POULTRY_SEAFOOD),
	POULTRY_MIXED_DISHES("Poultry mixed dishes", FoodSubcategory.MEAT_POULTRY_SEAFOOD),
	SEAFOOD_MIXED_DISHES("Seafood mixed dishes", FoodSubcategory.MEAT_POULTRY_SEAFOOD),
	BURRITOS_TACOS("Burritos and tacos", FoodSubcategory.MEXICAN),
	NACHOS("Nachos", FoodSubcategory.MEXICAN),
	OTHER_MEXICAN_MIXED_DISHES("Other Mexican mixed dishes", FoodSubcategory.MEXICAN),
	PIZZA("Pizza", FoodSubcategory.PIZZA),
	BURGERS("Burgers", FoodSubcategory.SANDWICHES),
	CHEESE_SANDWICHES("Cheese sandwiches", FoodSubcategory.SANDWICHES),
	CHICKEN_FILLET_SANDWICHES("Chicken fillet sandwiches", FoodSubcategory.SANDWICHES),
	DELI_CURED_MEAT_SANDWICHES("Deli and cured meat sandwiches", FoodSubcategory.SANDWICHES),
	EGG_BREAKFAST_SANDWICHES("Egg/breakfast sandwiches", FoodSubcategory.SANDWICHES),
	FRANKFURTER("Frankfurter sandwiches", FoodSubcategory.SANDWICHES),
	MEAT_BBQ_SANDWICHES("Meat and BBQ sandwiches", FoodSubcategory.SANDWICHES),
	PEANUT_BUTTER_JELLY_SANDWICHES("Peanut butter and jelly sandwiches", FoodSubcategory.SANDWICHES),
	SEAFOOD_SANDWICHES("Seafood sandwiches", FoodSubcategory.SANDWICHES),
	VEGETABLE_SANDWICHES_BURGERS("Vegetable sandwiches/burgers", FoodSubcategory.SANDWICHES),
	SOUPS("Soups", FoodSubcategory.SOUPS),
	COATINGS("Coatings", FoodSubcategory.OTHER),
	FOOD_POWDERS("Food powders", FoodSubcategory.OTHER),
	PROTEIN_AND_NUTRITIONAL_POWDERS("Protein and nutritional powders", FoodSubcategory.OTHER),
	YEAST("Yeast", FoodSubcategory.OTHER),
	COLD_CUTS_CURED_MEATS("Cold cuts and cured meats", FoodSubcategory.CURED_MEATS_POULTRY),
	BACON("Bacon", FoodSubcategory.CURED_MEATS_POULTRY),
	FRANKFURTERS("Frankfurters", FoodSubcategory.CURED_MEATS_POULTRY),
	SAUSAGES("Sausages", FoodSubcategory.CURED_MEATS_POULTRY),
	EGGS_OMELETS("Eggs and omelets", FoodSubcategory.EGGS),
	BEEF_EXCLUDES_GROUND("Beef, excludes ground", FoodSubcategory.MEATS),
	GROUND_BEEF("Ground beef", FoodSubcategory.MEATS),
	LAMB_GOAT_GAME("Lamb, goat, game", FoodSubcategory.MEATS),
	LIVER_ORGAN_MEATS("Liver and organ meats", FoodSubcategory.MEATS),
	PORK("Pork", FoodSubcategory.MEATS),
	BEANS_PEAS_LEGUMES("Beans, peas, legumes", FoodSubcategory.PLANT_BASED_PROTEIN),
	NUTS_SEEDS("Nuts and seeds", FoodSubcategory.PLANT_BASED_PROTEIN),
	PROCESSED_SOY_PRODUCTS("Processed soy products", FoodSubcategory.PLANT_BASED_PROTEIN),
	CHICKEN_WHOLE("Chicken, whole pieces", FoodSubcategory.POULTRY),
	CHICKEN_PATTIES("Chicken patties, nuggets and tenders", FoodSubcategory.POULTRY),
	TURKEY_DUCK_OTHER("Turkey, duck, other poultry", FoodSubcategory.POULTRY),
	FISH("Fish", FoodSubcategory.SEAFOOD),
	SHELLFISH("Shellfish", FoodSubcategory.SEAFOOD),
	CANDY_CHOCOLATE("Candy containing chocolate", FoodSubcategory.CANDY),
	CANDY_NO_CHOCOLATE("Candy not containing chocolate", FoodSubcategory.CANDY),
	CRACKERS("Crackers, excludes saltines", FoodSubcategory.CRACKERS),
	SALTINE_CRACKERS("Saltine crackers", FoodSubcategory.CRACKERS),
	GELATINS_ICES_SORBETS("Gelatins, ices, sorbets", FoodSubcategory.OTHER_DESSERTS),
	ICE_CREAM_FROZEN_DAIRY_DESSERTS("Ice cream and frozen dairy desserts", FoodSubcategory.OTHER_DESSERTS),
	PUDDING("Pudding", FoodSubcategory.OTHER_DESSERTS),
	POPCORN("Popcorn", FoodSubcategory.SAVORY_SNACKS),
	POTATO_CHIPS("Potato chips", FoodSubcategory.SAVORY_SNACKS),
	PRETZELS_SNACK_MIX("Pretzels/snack mix", FoodSubcategory.SAVORY_SNACKS),
	TORTILLA_CORN_OTHER_CHIPS("Tortilla, corn, other chips", FoodSubcategory.SAVORY_SNACKS),
	CEREAL_BARS("Cereal bars", FoodSubcategory.SNACK_MEAL_BARS),
	NUTRITION_BARS("Nutrition bars", FoodSubcategory.SNACK_MEAL_BARS),
	CAKES_PIES("Cakes and pies", FoodSubcategory.SWEET_BAKERY_PRODUCTS),
	COOKIES_BROWNIES("Cookies and brownies", FoodSubcategory.SWEET_BAKERY_PRODUCTS),
	DOUGHNUTS_SWEET_ROLLS_PASTRIES("Doughnuts, sweet rolls, pastries", FoodSubcategory.SWEET_BAKERY_PRODUCTS),
	SPICES_HERBS("Spices and herbs", FoodSubcategory.SPICES_HERBS),
	JAMS_SYRUPS_TOPPINGS("Jams, syrups, toppings", FoodSubcategory.SUGARS),
	SUGARS_HONEY("Sugars and honey", FoodSubcategory.SUGARS),
	SUGAR_SUBSTITUTES("Sugar substitutes", FoodSubcategory.SUGARS),
	BROCCOLI("Broccoli", FoodSubcategory.VEGETABLES),
	CABBAGE("Cabbage", FoodSubcategory.VEGETABLES),
	CARROTS("Carrots", FoodSubcategory.VEGETABLES),
	COLESLAW("Coleslaw, non-lettuce salads", FoodSubcategory.VEGETABLES),
	CORN("Corn", FoodSubcategory.VEGETABLES),
	FRIED_VEGETABLES("Fried vegetables", FoodSubcategory.VEGETABLES),
	LETTUCE("Lettuce and lettuce salads", FoodSubcategory.VEGETABLES),
	ONIONS("Onions", FoodSubcategory.VEGETABLES),
	OTHER_DARK_GREEN_VEGETABLES("Other dark green vegetables", FoodSubcategory.VEGETABLES),
	OTHER_RED_ORANGE_VEGETABLES("Other red and orange vegetables", FoodSubcategory.VEGETABLES),
	OTHER_STARCHY_VEGETABLES("Other starchy vegetables", FoodSubcategory.VEGETABLES),
	OTHER_VEGETABLES("Other vegetables and combinations", FoodSubcategory.VEGETABLES),
	VEGETABLES_ON_A_SANDWICH("Vegetables on a sandwich", FoodSubcategory.VEGETABLES),
	STRING_BEANS("String beans", FoodSubcategory.VEGETABLES),
	SPINACH("Spinach", FoodSubcategory.VEGETABLES),
	TOMATOES("Tomatoes", FoodSubcategory.VEGETABLES),
	FRENCH_FRIES("French fries and other fried white potatoes", FoodSubcategory.WHITE_POTATOES),
	MASHED_POTATOES("Mashed potatoes and white potato mixtures", FoodSubcategory.WHITE_POTATOES),
	WHITE_POTATOES("White potatoes, baked or boiled", FoodSubcategory.WHITE_POTATOES),
	FLAVORED_CARBONATED_WATER("Flavored or carbonated water", FoodSubcategory.FLAVORED_ENHANCED_WATER),
	ENHANCED_WATER("Enhanced water", FoodSubcategory.FLAVORED_ENHANCED_WATER),
	BOTTLED_WATER("Bottled water", FoodSubcategory.PLAIN_WATER),
	TAP_WATER("Tap water", FoodSubcategory.PLAIN_WATER);

	private final String name;
	private final FoodSubcategory subcategory;

	FoodGroup(String name, FoodSubcategory subcategory) {
		this.name = name;
		this.subcategory = subcategory;
	}

	public String getName() {
		return name;
	}

	public FoodSubcategory getSubcategory() {
		return subcategory;
	}

	private static final Map<String, FoodGroup> map = new HashMap<>(values().length, 1);

	static {
		for (FoodGroup c : values()) map.put(c.name, c);
	}

	public static FoodGroup of(String name) {
		FoodGroup result = map.get(name);
		if (result == null) {
			throw new IllegalArgumentException("Invalid food group name: " + name);
		}
		return result;
	}

	public static FoodGroup findGroup(String name, String category) {
		String comparableName = name.toLowerCase();
		String comparableCategory = category.toLowerCase();
		FoodGroup result = null;
		switch (comparableCategory) {
			case "american indian/alaska native Foods" -> {
				if (comparableName.contains("liver"))
					result = LIVER_ORGAN_MEATS;
				else if (comparableName.contains("mush") || comparableName.contains("cornmeal"))
					result = GRITS_OTHER_COOKED_CEREALS;
				else if (comparableName.contains("fish") ||
						comparableName.contains("whale"))
					result = FISH;
				else if (comparableName.contains("duck"))
					result = TURKEY_DUCK_OTHER;
				else if (comparableName.contains("sea cucumber"))
					result = SHELLFISH;
				else if (comparableName.contains("mashu"))
					result = OTHER_VEGETABLES;
				else
					result = LAMB_GOAT_GAME;
			}
			case "baked products" -> {
				if (comparableName.contains("bread"))
					result = YEAST_BREADS;
				else if (comparableName.contains("cookie") || comparableName.contains("brownie"))
					result = COOKIES_BROWNIES;
				else if (comparableName.contains("bagel"))
					result = BAGELS_MUFFINS;
				else if (comparableName.contains("muffin")) {
					if (comparableName.contains("english"))
						result = BAGELS_MUFFINS;
					else
						result = BISCUITS_MUFFINS_QUICK_BREADS;
				} else if (comparableName.contains("biscuit"))
					result = BISCUITS_MUFFINS_QUICK_BREADS;
				else if (comparableName.contains("waffle") ||
						comparableName.contains("pancake") ||
						comparableName.contains("toast"))
					result = PANCAKES_WAFFLES_FRENCH_TOAST;
				else if (comparableName.contains("coating"))
					result = COATINGS;
				else if (comparableName.contains("cake") || comparableName.contains("pie"))
					result = CAKES_PIES;
				else if (comparableName.contains("tostada") || comparableName.contains("tortilla"))
					result = TORTILLAS;
				else if (comparableName.contains("cracker")) {
					if (comparableName.contains("salt"))
						result = SALTINE_CRACKERS;
					else
						result = CRACKERS;
				} else
					result = DOUGHNUTS_SWEET_ROLLS_PASTRIES;
			}
			case "beverages" -> {
				if (comparableName.contains("milk"))
					result = MILK_SUBSTITUTES;
			}
			case "beef products" -> {
				if (comparableName.contains("ground"))
					result = GROUND_BEEF;
				else
					result = BEEF_EXCLUDES_GROUND;
			}
			case "cereal grains and pasta" -> {
				if (comparableName.contains("flour"))
					result = FLOUR;
				if (comparableName.contains("oat"))
					result = OATS;
			}
			case "dairy and egg products" -> {
				if (comparableName.contains("egg"))
					result = EGGS_OMELETS;
				else if (comparableName.contains("cream")) {
					if (comparableName.contains("whip") || comparableName.contains("cheese") || comparableName.contains("sour"))
						result = CREAM_CHEESE_SOUR_CREAM_WHIPPED_CREAM;
					else
						result = CREAM_CREAM_SUBSTITUTES;
				} else if (comparableName.contains("cheese")) {
					if (comparableName.contains("ricotta") || comparableName.contains("cottage"))
						result = COTTAGE_RICOTTA;
					else
						result = CHEESE;
				} else if (comparableName.contains("yogurt")) {
					if (comparableName.contains("greek"))
						result = YOGURT_GREEK;
					else
						result = YOGURT_REGULAR;
				} else if (comparableName.contains("milk") || comparableName.contains("buttermilk")) {
					if (comparableName.contains("flavor")) {
						if (comparableName.contains("whole"))
							result = FLAVORED_MILK_WHOLE;
						else if (comparableName.contains("low"))
							result = FLAVORED_MILK_LOWFAT;
						else if (comparableName.contains("non"))
							result = FLAVORED_MILK_NONFAT;
						else if (comparableName.contains("reduce"))
							result = FLAVORED_MILK_REDUCED_FAT;
					} else {
						if (comparableName.contains("whole"))
							result = MILK_WHOLE;
						else if (comparableName.contains("low"))
							result = MILK_LOWFAT;
						else if (comparableName.contains("non") || comparableName.contains("skim") || comparableName.contains("fat free"))
							result = MILK_NONFAT;
						else if (comparableName.contains("reduce"))
							result = MILK_REDUCED_FAT;
						else
							result = MILK_SHAKES_OTHER_DAIRY_DRINKS;
					}
				} else if (comparableName.contains("butter"))
					result = BUTTER_ANIMAL_FATS;

			}
			case "fats and oils" -> {
				if (comparableName.contains("oil")) {
					if (comparableName.contains("coconut") ||
							comparableName.contains("canola") ||
							comparableName.contains("corn") ||
							comparableName.contains("soy") ||
							comparableName.contains("olive") ||
							comparableName.contains("peanut") ||
							comparableName.contains("sunflower") ||
							comparableName.contains("safflower"))
						result = SALAD_DRESSINGS_VEGETABLE_OILS;
				}
			}
			case "finfish and shellfish products" -> {
				if (comparableName.contains("shrimp") ||
						comparableName.contains("mussel") ||
						comparableName.contains("lobster") ||
						comparableName.contains("cray") ||
						comparableName.contains("barnacle") ||
						comparableName.contains("clam") ||
						comparableName.contains("oyster") ||
						comparableName.contains("winkle") ||
						comparableName.contains("scallop") ||
						comparableName.contains("squid") ||
						comparableName.contains("geoduck") ||
						comparableName.contains("cuttle") ||
						comparableName.contains("octopus") ||
						comparableName.contains("whelk") ||
						comparableName.contains("snail") ||
						comparableName.contains("slug") ||
						comparableName.contains("abalone") ||
						comparableName.contains("conch") ||
						comparableName.contains("crab") ||
						comparableName.contains("krill") ||
						comparableName.contains("cockle") ||
						comparableName.contains("urchin") ||
						comparableName.contains("sea cucumber") ||
						comparableName.contains("nerit"))
					result = SHELLFISH;
				else
					result = FISH;
			}
			case "fruits and fruit juices" -> {
				if (!comparableName.contains("juice")) {
					if (comparableName.contains("dried"))
						result = DRIED_FRUITS;
					else if (comparableName.contains("banana"))
						result = BANANAS;
					else if (comparableName.contains("apple"))
						result = APPLES;
					else if (comparableName.contains("grapefruit") || comparableName.contains("orange"))
						result = CITRUS_FRUITS;
					else if (comparableName.contains("melon"))
						result = MELONS;
					else if (comparableName.contains("pineapple"))
						result = PINEAPPLE;
					else if (comparableName.contains("straw"))
						result = STRAWBERRIES;
					else if (comparableName.contains("berr"))
						result = BLUEBERRIES_OTHER_BERRIES;
					else if (comparableName.contains("grape"))
						result = GRAPES;
					else if (comparableName.contains("peach") || comparableName.contains("nectarine"))
						result = PEACHES_NECTARINES;
					else if (comparableName.contains("olive"))
						result = OLIVES_PICKLES_PICKLED_VEGETABLES;
					else
						result = OTHER_FRUITS_FRUIT_SALADS;
				} else {
					if (comparableName.contains("grapefruit") || comparableName.contains("orange"))
						result = CITRUS_JUICE;
					else if (comparableName.contains("apple"))
						result = APPLE_JUICE;
					else
						result = OTHER_FRUIT_JUICE;
				}
			}
			case "lamb, veal, and game products" -> {
				if (comparableName.contains("veal")) {
					if (comparableName.contains("ground"))
						result = GROUND_BEEF;
					else
						result = BEEF_EXCLUDES_GROUND;
				} else
					result = LAMB_GOAT_GAME;
			}
			case "legumes and legume products" -> {
				if (comparableName.contains("milk"))
					result = MILK_SUBSTITUTES;
				else if (comparableName.contains("butter") || comparableName.contains("tahini"))
					result = NUTS_SEEDS;
				else if (comparableName.contains("hummus"))
					result = DIPS_GRAVIES_OTHER_SAUCES;
				else if (comparableName.contains("bean"))
					result = BEANS_PEAS_LEGUMES;
				else if (comparableName.contains("flour"))
					result = FLOUR;
			}
			case "not included in a food category" -> {
				if (comparableName.contains("whey") || comparableName.contains("protein"))
					result = PROTEIN_AND_NUTRITIONAL_POWDERS;
				else if (comparableName.contains("powder"))
					result = FOOD_POWDERS;
				else if (comparableName.contains("milk"))
					result = MILK_SHAKES_OTHER_DAIRY_DRINKS;
				else if (comparableName.contains("wheat"))
					result = OTHER_GRAINS;
				else if (comparableName.contains("cheese")) {
					if (comparableName.contains("ricotta") || comparableName.contains("cottage"))
						result = COTTAGE_RICOTTA;
					else
						result = CHEESE;
				} else if (comparableName.contains("oat"))
					result = OATS;
				else if (comparableName.contains("basil") ||
						comparableName.contains("cilantro") ||
						comparableName.contains("chives") ||
						comparableName.contains("parsley"))
					result = SPICES_HERBS;
				else if (comparableName.contains("seaweed"))
					result = OTHER_DARK_GREEN_VEGETABLES;
				else if (comparableName.contains("yeast"))
					result = YEAST;
				else if (comparableName.contains("vegetable mixture"))
					result = OTHER_VEGETABLES;
				else if (comparableName.contains("bacon"))
					result = BACON;
				else if (comparableName.contains("ham"))
					result = COLD_CUTS_CURED_MEATS;
				else if (comparableName.contains("beef"))
					result = BEEF_EXCLUDES_GROUND;
				else if (comparableName.contains("chicken"))
					result = CHICKEN_WHOLE;
				else if (comparableName.contains("cream"))
					result = CREAM_CREAM_SUBSTITUTES;
				else if (comparableName.contains("gravy"))
					result = DIPS_GRAVIES_OTHER_SAUCES;
				else if (comparableName.contains("soy"))
					result = SOY_BASED_CONDIMENTS;
				else if (comparableName.contains("sauce")) {
					if (comparableName.contains("tomato"))
						result = TOMATO_BASED_CONDIMENTS;
					else
						result = DIPS_GRAVIES_OTHER_SAUCES;
				} else if (comparableName.contains("coffee"))
					result = COFFEE;
				else if (comparableName.contains("tea"))
					result = TEA;
				else if (comparableName.contains("drink")) {
					if (comparableName.contains("diet")) {
						if (comparableName.contains("soft"))
							result = DIET_SOFT_DRINKS;
						else if (comparableName.contains("sport"))
							result = DIET_SPORTS_ENERGY_DRINKS;
						else
							result = OTHER_DIET_DRINKS;
					} else if (comparableName.contains("soft"))
						result = SOFT_DRINKS;
					else if (comparableName.contains("fruit"))
						result = FRUIT_DRINKS;
					else if (comparableName.contains("sport"))
						result = SPORT_ENERGY_DRINKS;
					else
						result = SMOOTHIES_AND_GRAIN_DRINKS;
				} else if (comparableName.contains("fish"))
					result = FISH;
				else if (comparableName.contains("bun"))
					result = ROLLS_BUNS;
				else if (comparableName.contains("breakfast meat"))
					result = COLD_CUTS_CURED_MEATS;
				else if (comparableName.contains("bread"))
					result = YEAST_BREADS;
				else if (comparableName.contains("spinach"))
					result = SPINACH;
				else if (comparableName.contains("carrot"))
					result = CARROTS;
				else if (comparableName.contains("bean"))
					result = BEANS_PEAS_LEGUMES;
				else if (comparableName.contains("broccoli"))
					result = BROCCOLI;
				else if (comparableName.contains("cabbage"))
					result = CABBAGE;
				else if (comparableName.contains("tomato"))
					result = TOMATOES;
				if (comparableName.contains("onion"))
					result = ONIONS;
				else if (comparableName.contains("industrial oil"))
					result = SALAD_DRESSINGS_VEGETABLE_OILS;
				else if (comparableName.contains("mushroom") ||
						comparableName.contains("pepper") ||
						comparableName.contains("cucumber") ||
						comparableName.contains("cauliflower") ||
						comparableName.contains("eggplant") ||
						comparableName.contains("squash") ||
						comparableName.contains("dark green") ||
						comparableName.contains("other vegetables") ||
						comparableName.contains("vegetables"))
					result = OTHER_VEGETABLES;
			}
			case "nut and seed products" -> {
				if (comparableName.contains("nut"))
					result = NUTS_SEEDS;
				else if (comparableName.contains("butter") || comparableName.contains("tahini"))
					result = NUTS_SEEDS;
				else if (comparableName.contains("seed"))
					result = NUTS_SEEDS;
				else if (comparableName.contains("flour"))
					result = FLOUR;
			}
			case "pork products" -> {
				if (comparableName.contains("ham"))
					result = COLD_CUTS_CURED_MEATS;
				else if (comparableName.contains("bacon"))
					result = BACON;
			}
			case "poultry products" -> {
				if (comparableName.contains("chicken")) {
					if (comparableName.contains("broiler"))
						result = CHICKEN_WHOLE;
				} else if (comparableName.contains("turkey"))
					result = TURKEY_DUCK_OTHER;
			}
			case "restaurant foods" -> {
				if (comparableName.contains("chinese")) {
					if (comparableName.contains("rice"))
						result = FRIED_RICE_LOCHOW_MEIN;
					else if (comparableName.contains("sushi") ||
							comparableName.contains("dump") ||
							comparableName.contains("egg"))
						result = EGG_ROLLS_DUMPLINGS_SUSHI;
					else
						result = STIR_FRY_SOY_BASED_MIXTURES;
				} else if (comparableName.contains("latin") || comparableName.contains("mexic")) {
					if (comparableName.contains("burrito") || comparableName.contains("taco"))
						result = BURRITOS_TACOS;
					else if (comparableName.contains("nacho"))
						result = NACHOS;
					else
						result = OTHER_MEXICAN_MIXED_DISHES;
				}
			}
			case "sausages and luncheon meats" -> {
				if (comparableName.contains("sausage"))
					result = SAUSAGES;
				else if (comparableName.contains("frankfurt"))
					result = FRANKFURTERS;
				else if (comparableName.contains("ham"))
					result = COLD_CUTS_CURED_MEATS;
			}
			case "snacks" -> {
				if (comparableName.contains("beef jerky"))
					result = COLD_CUTS_CURED_MEATS;
				else if (comparableName.contains("trail"))
					result = NUTS_SEEDS;
				else if (comparableName.contains("chip")) {
					if (comparableName.contains("potato"))
						result = POTATO_CHIPS;
					else
						result = TORTILLA_CORN_OTHER_CHIPS;
				} else if (comparableName.contains("bar")) {
					if (comparableName.contains("granola") ||
							comparableName.contains("cereal") ||
							comparableName.contains("oat"))
						result = CEREAL_BARS;
					else
						result = NUTRITION_BARS;
				} else if (comparableName.contains("pretzel"))
					result = PRETZELS_SNACK_MIX;
				else if (comparableName.contains("popcorn"))
					result = POPCORN;
			}
			case "soups, sauces, and gravies" -> {
				if (comparableName.contains("pasta"))
					result = PASTA_SAUCES;
				else
					result = DIPS_GRAVIES_OTHER_SAUCES;
			}
			case "spices and herbs" -> {
				if (comparableName.contains("mustard") || comparableName.contains("salt"))
					result = MUSTARD_OTHER_CONDIMENTS;
				else
					result = SPICES_HERBS;
			}
			case "sweets" -> {
				if (comparableName.contains("granulated"))
					result = SUGARS_HONEY;
				else if (comparableName.contains("leather"))
					result = CANDY_NO_CHOCOLATE;
				else if (comparableName.contains("pudding"))
					result = PUDDING;
				else if (comparableName.contains("candy") || comparableName.contains("candies")) {
					if (comparableName.contains("choc"))
						result = CANDY_CHOCOLATE;
					else
						result = CANDY_NO_CHOCOLATE;
				} else if (comparableName.contains("ice cream") ||
						comparableName.contains("sherbe") ||
						comparableName.contains("sorbet"))
					result = ICE_CREAM_FROZEN_DAIRY_DESSERTS;
				else if (comparableName.contains("choco"))
					result = CANDY_CHOCOLATE;
				else
					result = DOUGHNUTS_SWEET_ROLLS_PASTRIES;
			}
			case "vegetables and vegetable products" -> {
				if (comparableName.contains("juice"))
					result = VEGETABLE_JUICE;
				else if (comparableName.contains("frie"))
					result = FRENCH_FRIES;
				else if (comparableName.contains("mash"))
					result = MASHED_POTATOES;
				else if (comparableName.contains("potato")) {
					if (comparableName.contains("white") || comparableName.contains("russet"))
						result = WHITE_POTATOES;
					else if (comparableName.contains("pancake") || comparableName.contains("stew"))
						result = MASHED_POTATOES;
					else if (comparableName.contains("tot"))
						result = FRENCH_FRIES;
					else
						result = OTHER_RED_ORANGE_VEGETABLES;
				} else if (comparableName.contains("tomato"))
					result = TOMATOES;
				else if (comparableName.contains("bean"))
					result = BEANS_PEAS_LEGUMES;
				else if (comparableName.contains("carrot"))
					result = CARROTS;
				else if (comparableName.contains("broccoli"))
					result = BROCCOLI;
				else if (comparableName.contains("lettuce"))
					result = LETTUCE;
				else if (comparableName.contains("cabbage"))
					result = CABBAGE;
				else if (comparableName.contains("spinach"))
					result = SPINACH;
				else if (comparableName.contains("kale"))
					result = OTHER_DARK_GREEN_VEGETABLES;
				else if (comparableName.contains("pickle"))
					result = OLIVES_PICKLES_PICKLED_VEGETABLES;
				else if (comparableName.contains("onion") && comparableName.contains("ring"))
					result = FRIED_VEGETABLES;
				else if (comparableName.contains("onion"))
					result = ONIONS;
				else if (comparableName.contains("garlic"))
					result = MUSTARD_OTHER_CONDIMENTS;
				else if (comparableName.contains("ketchup"))
					result = TOMATO_BASED_CONDIMENTS;
				else if (comparableName.contains("mushroom") ||
						comparableName.contains("pepper") ||
						comparableName.contains("celery") ||
						comparableName.contains("cucumber") ||
						comparableName.contains("seaweed"))
					result = OTHER_VEGETABLES;
			}
		}

		if (result == null) {
			throw new IllegalArgumentException("Could not find group for: " + name + " (" + category + ")");
		}
		return result;
	}

}
