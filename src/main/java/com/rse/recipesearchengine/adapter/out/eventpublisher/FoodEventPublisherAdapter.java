package com.rse.recipesearchengine.adapter.out.eventpublisher;

import com.rse.recipesearchengine.application.event.FoodImportedEvent;
import com.rse.recipesearchengine.application.port.out.FoodEventPublisher;
import com.rse.recipesearchengine.common.EventPublisherAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@EventPublisherAdapter
@RequiredArgsConstructor
public class FoodEventPublisherAdapter implements FoodEventPublisher {

	private final ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void publishFoodImportedEvent(FoodImportedEvent event) {
		applicationEventPublisher.publishEvent(event);
	}

}
