package com.rse.recipesearchengine.application.port.out;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;

public interface ExceptionEventPublisher {

	void publishException(Exception exception);

}
