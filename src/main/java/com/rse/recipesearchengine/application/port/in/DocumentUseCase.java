package com.rse.recipesearchengine.application.port.in;

import com.rse.recipesearchengine.domain.Document;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface DocumentUseCase {

	Document get(String name);

	Document save(MultipartFile file);

	void appendContent(String name, MultipartFile file);

	Resource load(String name);

	List<Document> loadAll();

}
