package com.rse.recipesearchengine.application.port.out;

import com.rse.recipesearchengine.domain.Document;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface DocumentStorage {

	void init();

	Optional<Document> find(String name);

	void save(MultipartFile file);

	void save(Document document);

	void append(String name, MultipartFile file);

	void update(String name, Document document);

	Resource load(String name);

	void deleteAll();

	List<Document> findAllDocuments();

}
