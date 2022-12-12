package com.rse.recipesearchengine.adapter.out.persistence.repository;

import com.rse.recipesearchengine.adapter.out.persistence.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {

	Optional<FoodEntity> findByName(String name);

}
