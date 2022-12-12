package com.rse.recipesearchengine.adapter.out.persistence.entity;

import com.rse.recipesearchengine.domain.FoodUnit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FOOD_PORTION")
@Getter
@Setter
@NoArgsConstructor
public class FoodPortionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "FOOD_UNIT")
	@Enumerated(EnumType.STRING)
	private FoodUnit unit;

	@Column(name = "GRAMS")
	private Double grams;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FOOD_ID", nullable = false)
	private FoodEntity foodEntity;

}
