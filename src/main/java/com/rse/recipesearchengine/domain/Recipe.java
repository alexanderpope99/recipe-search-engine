package com.rse.recipesearchengine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Recipe {

	@NonNull
	private String name;

	private String description;

	@NonNull
	private LocalDate dateAdded;

	@NonNull
	private Double servings;

	private List<RecipeCourse> courses;

	private Integer prepTime;

	private Integer cookTime;

	private String sourceLink;

	private Double rating;

	private Integer votes;

	@NonNull
	private List<Image> images;

	private RecipeDifficulty difficulty;

	@NonNull
	private ItemVisibility visibility;

	private Set<Tag> tags;

	private List<Equipment> equipment;

	@NonNull
	private Author author;

	private List<Note> notes;

}
