package com.rse.recipesearchengine.application.event;

import com.rse.recipesearchengine.domain.Food;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FoodImportedEvent {

	private Food food;

	private LocalDateTime date;

	public FoodImportedEvent(Food food) {
		this.food = food;
		this.date = LocalDateTime.now();
	}

}
