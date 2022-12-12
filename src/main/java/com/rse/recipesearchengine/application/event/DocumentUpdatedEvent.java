package com.rse.recipesearchengine.application.event;


import com.rse.recipesearchengine.domain.Document;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DocumentUpdatedEvent {

	private Document document;

	private LocalDateTime date;

	public DocumentUpdatedEvent(Document document) {
		this.document = document;
		this.date = LocalDateTime.now();
	}

}
