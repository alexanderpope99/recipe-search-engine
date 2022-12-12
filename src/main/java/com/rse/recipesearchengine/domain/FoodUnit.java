package com.rse.recipesearchengine.domain;

import java.util.HashMap;
import java.util.Map;

public enum FoodUnit {
	CONTAINER("container"),
	CUP("cup"),
	GALLON("gallon"),
	GRAM("g"),
	KILOGRAM("kg"),
	LARGE("large"),
	LITER("l"),
	MEDIUM("medium"),
	MILIGRAM("mg"),
	MILILITER("ml"),
	OUNCE("oz"),
	PINT("pint"),
	POUND("lb"),
	QUART("qt"),
	SERVING("serving"),
	SMALL("small"),
	TABLESPOON("tablespoon"),
	TEASPOON("teaspoon"),
	VERY_LARGE("very large"),
	VERY_SMALL("very small");

	private final String name;

	FoodUnit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private static final Map<String, FoodUnit> map = new HashMap<>(values().length, 1);

	static {
		for (FoodUnit c : values()) map.put(c.name, c);
	}

	public static FoodUnit of(String name) {
		FoodUnit result = map.get(name);
		if (result == null) {
			result = SERVING;
		}
		return result;
	}
}
