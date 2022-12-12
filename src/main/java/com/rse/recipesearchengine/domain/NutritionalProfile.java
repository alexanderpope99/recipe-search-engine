package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class NutritionalProfile {

	private Double energy;

	private Double protein;

	private Double fat;

	private Double dietaryFiber;

}
