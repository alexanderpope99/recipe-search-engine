package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class InstructionPart {

	private String title;

	private List<Instruction> recipeIngredients;

}
