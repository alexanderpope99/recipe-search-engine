package com.rse.recipesearchengine.adapter.in.eventlistener;

import com.rse.recipesearchengine.application.event.FoodImportedEvent;
import com.rse.recipesearchengine.common.ListenerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

@ListenerAdapter
@Slf4j
public class FoodEventListenerAdapter {

	@EventListener
	public void handle(FoodImportedEvent event) {
//		log.info("Food imported at {} : {} ", event.getDate(), event.getFood().getName());
	}

}
