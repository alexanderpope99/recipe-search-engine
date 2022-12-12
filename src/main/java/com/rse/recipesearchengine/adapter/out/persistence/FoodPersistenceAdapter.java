package com.rse.recipesearchengine.adapter.out.persistence;

import com.rse.recipesearchengine.adapter.out.persistence.entity.FoodEntity;
import com.rse.recipesearchengine.adapter.out.persistence.entity.FoodPortionEntity;
import com.rse.recipesearchengine.adapter.out.persistence.mapper.FoodMapper;
import com.rse.recipesearchengine.adapter.out.persistence.repository.FoodRepository;
import com.rse.recipesearchengine.application.exception.FoodAlreadyExistsException;
import com.rse.recipesearchengine.application.port.out.FoodStorage;
import com.rse.recipesearchengine.common.PersistenceAdapter;
import com.rse.recipesearchengine.domain.Food;
import lombok.AllArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@AllArgsConstructor
public class FoodPersistenceAdapter implements FoodStorage {

	private final FoodRepository foodRepository;

	private final FoodMapper foodMapper;

	@Override
	public Optional<Food> find(String name) {
		return foodRepository.findByName(name).map(foodMapper::toFood);
	}

	@Override
	public void save(Food food) {
		if (find(food.getName()).isPresent())
			throw new FoodAlreadyExistsException("Food \"" + food.getName() + "\" already exists", food.getName());
		FoodEntity foodEntity = foodMapper.toFoodEntity(food);
		foodEntity.setCategory(food.getGroup().getSubcategory().getCategory());
		foodEntity.setSubcategory(food.getGroup().getSubcategory());
		foodEntity.setGroup(food.getGroup());
		for (FoodPortionEntity foodPortionEntity : foodEntity.getFoodPortions())
			foodPortionEntity.setFoodEntity(foodEntity);
		foodRepository.save(foodEntity);
	}

}
