package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Instruction {

	@NonNull
	private String description;

	@NonNull
	private Integer step;

	private Integer prepTime;

	private Integer cookTime;

}
