package com.rse.recipesearchengine.application.port.out;

import com.rse.recipesearchengine.domain.Food;

import java.util.Optional;

public interface FoodStorage {

	Optional<Food> find(String name);

	void save(Food food);

}
