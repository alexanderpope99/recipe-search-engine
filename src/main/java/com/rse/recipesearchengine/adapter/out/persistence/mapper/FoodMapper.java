package com.rse.recipesearchengine.adapter.out.persistence.mapper;

import com.rse.recipesearchengine.adapter.out.persistence.entity.FoodEntity;
import com.rse.recipesearchengine.domain.Food;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface FoodMapper {

	Food toFood(FoodEntity foodEntity);

	@Mapping(target = "id", ignore = true)
	FoodEntity toFoodEntity(Food food);

}
