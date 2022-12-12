package com.rse.recipesearchengine.adapter.out.eventpublisher;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;
import com.rse.recipesearchengine.application.event.DocumentUpdatedEvent;
import com.rse.recipesearchengine.application.port.out.DocumentEventPublisher;
import com.rse.recipesearchengine.common.EventPublisherAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@EventPublisherAdapter
@RequiredArgsConstructor
public class DocumentEventPublisherAdapter implements DocumentEventPublisher {

	private final ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void publishDocumentCreatedEvent(DocumentCreatedEvent event) {
		applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void publishDocumentUpdatedEvent(DocumentUpdatedEvent event) {
		applicationEventPublisher.publishEvent(event);
	}

}

