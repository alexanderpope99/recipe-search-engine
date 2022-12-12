package com.rse.recipesearchengine.application.service;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;
import com.rse.recipesearchengine.application.event.DocumentUpdatedEvent;
import com.rse.recipesearchengine.application.exception.DocumentNotFoundException;
import com.rse.recipesearchengine.application.port.in.DocumentUseCase;
import com.rse.recipesearchengine.application.port.out.DocumentEventPublisher;
import com.rse.recipesearchengine.application.port.out.DocumentStorage;
import com.rse.recipesearchengine.common.UseCase;
import com.rse.recipesearchengine.domain.Document;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@UseCase
@AllArgsConstructor
public class DocumentService implements DocumentUseCase {

	private final DocumentStorage documentStorage;

	private final DocumentEventPublisher documentEventPublisher;

	@Override
	public Document get(String name) {
		return documentStorage.find(name).orElseThrow(() ->
				new DocumentNotFoundException("Document with name " + name + " not found", name));
	}

	@Override
	public Document save(MultipartFile file) {
		Document document = new Document(Objects.requireNonNull(file.getOriginalFilename()));

		documentStorage.save(document);
		documentStorage.save(file);
		documentEventPublisher.publishDocumentCreatedEvent(new DocumentCreatedEvent(document));

		return document;
	}

	@Override
	public void appendContent(String name, MultipartFile file) {
		Document document = get(name);
		documentStorage.append(document.getName(), file);
		document.setModified(LocalDateTime.now());
		documentStorage.update(name, document);
		documentEventPublisher.publishDocumentUpdatedEvent(new DocumentUpdatedEvent(document));
	}

	@Override
	public Resource load(String name) {
		get(name);
		return documentStorage.load(name);
	}

	@Override
	public List<Document> loadAll() {
		return documentStorage.findAllDocuments();
	}
}
