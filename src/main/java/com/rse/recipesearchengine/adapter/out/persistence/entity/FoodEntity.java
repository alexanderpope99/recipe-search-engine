package com.rse.recipesearchengine.adapter.out.persistence.entity;

import com.rse.recipesearchengine.domain.FoodCategory;
import com.rse.recipesearchengine.domain.FoodGroup;
import com.rse.recipesearchengine.domain.FoodSubcategory;
import com.rse.recipesearchengine.domain.FoodType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "FOOD")
@Getter
@Setter
@NoArgsConstructor
public class FoodEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "FOOD_TYPE")
	@Enumerated(EnumType.STRING)
	private FoodType type;

	@Column(name = "FOOD_CATEGORY")
	@Enumerated(EnumType.STRING)
	private FoodCategory category;

	@Column(name = "FOOD_SUBCATEGORY")
	@Enumerated(EnumType.STRING)
	private FoodSubcategory subcategory;

	@Column(name = "FOOD_GROUP")
	@Enumerated(EnumType.STRING)
	private FoodGroup group;

	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			mappedBy = "foodEntity"
	)
	private List<FoodPortionEntity> foodPortions = new ArrayList<>();

}
