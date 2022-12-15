package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Instruction {

	private Integer step;

	private String title;

	private String description;

	private List<Image> images;

}
