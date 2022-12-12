package com.rse.recipesearchengine.adapter.in.eventlistener;

import com.rse.recipesearchengine.common.ListenerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

@ListenerAdapter
@Slf4j
public class ExceptionEventListenerAdapter {

	@EventListener
	public void handle(Exception exception) {
		log.error(exception.getMessage());
	}

}
