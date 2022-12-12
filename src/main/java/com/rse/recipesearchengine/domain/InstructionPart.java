package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class InstructionPart {

	private String title;

	private Integer step;

	private List<Instruction> instructions;

}
