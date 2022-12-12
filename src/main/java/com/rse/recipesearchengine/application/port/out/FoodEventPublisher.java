package com.rse.recipesearchengine.application.port.out;

import com.rse.recipesearchengine.application.event.FoodImportedEvent;

public interface FoodEventPublisher {

	void publishFoodImportedEvent(FoodImportedEvent event);

}
