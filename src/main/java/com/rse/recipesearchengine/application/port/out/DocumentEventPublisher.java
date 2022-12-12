package com.rse.recipesearchengine.application.port.out;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;
import com.rse.recipesearchengine.application.event.DocumentUpdatedEvent;

public interface DocumentEventPublisher {

	void publishDocumentCreatedEvent(DocumentCreatedEvent event);

	void publishDocumentUpdatedEvent(DocumentUpdatedEvent event);

}
