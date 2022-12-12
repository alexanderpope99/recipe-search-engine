package com.rse.recipesearchengine.adapter.out.eventpublisher;

import com.rse.recipesearchengine.application.port.out.ExceptionEventPublisher;
import com.rse.recipesearchengine.common.EventPublisherAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@EventPublisherAdapter
@RequiredArgsConstructor
public class ExceptionEventPublisherAdapter implements ExceptionEventPublisher {

	private final ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void publishException(Exception exception) {
		applicationEventPublisher.publishEvent(exception);
	}

}
