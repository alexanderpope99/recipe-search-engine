package com.rse.recipesearchengine.adapter.in.eventlistener;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;
import com.rse.recipesearchengine.application.event.DocumentUpdatedEvent;
import com.rse.recipesearchengine.common.ListenerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

@ListenerAdapter
@Slf4j
public class DocumentEventListenerAdapter {

	@EventListener
	public void handle(DocumentCreatedEvent event) {
		log.info("Document created at {} : {} ", event.getDate(), event.getDocument().getName());
	}

	@EventListener
	public void handle(DocumentUpdatedEvent event) {
		log.info("Document updated at {} : {} ", event.getDate(), event.getDocument().getName());
	}

}
