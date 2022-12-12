package com.rse.recipesearchengine.domain;

import java.util.HashMap;
import java.util.Map;

public enum FoodType {

	BRANDED("Branded"),
	SURVEY("Survey (FNDDS)"),
	FOUNDATION("Foundation"),
	SR_LEGACY("SR Legacy");

	private final String name;

	FoodType(String name) {
		this.name = name;
	}

	private static final Map<String, FoodType> map = new HashMap<>(values().length, 1);

	static {
		for (FoodType c : values()) map.put(c.name, c);
	}

	public static FoodType of(String name) {
		FoodType result = map.get(name);
		if (result == null) {
			throw new IllegalArgumentException("Invalid food type name: " + name);
		}
		return result;
	}
}
