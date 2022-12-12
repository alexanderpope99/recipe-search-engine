package com.rse.recipesearchengine.adapter.out.persistence;

import com.rse.recipesearchengine.adapter.out.persistence.entity.DocumentEntity;
import com.rse.recipesearchengine.adapter.out.persistence.mapper.DocumentMapper;
import com.rse.recipesearchengine.adapter.out.persistence.repository.DocumentRepository;
import com.rse.recipesearchengine.application.exception.DocumentContentNotFoundException;
import com.rse.recipesearchengine.application.exception.DocumentNotFoundException;
import com.rse.recipesearchengine.application.port.out.DocumentStorage;
import com.rse.recipesearchengine.common.PersistenceAdapter;
import com.rse.recipesearchengine.common.Utils;
import com.rse.recipesearchengine.domain.Document;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@PersistenceAdapter
@AllArgsConstructor
public class DocumentPersistenceAdapter implements DocumentStorage {

	private final DocumentRepository documentRepository;

	private final DocumentMapper documentMapper;

	private final Path root = Paths.get("uploads");

	@Override
	public void init() {
		try {
			Files.createDirectories(root);
		} catch (IOException e) {
			throw new RuntimeException("Could not initialize folder for upload!");
		}
	}

	@Override
	public Optional<Document> find(String filename) {
		return documentRepository.findByName(filename).map(documentMapper::toDocument);
	}

	@Override
	public void save(MultipartFile file) {
		String filename = Objects.requireNonNull(file.getOriginalFilename());
		try {
			Files.copy(file.getInputStream(), this.root.resolve(filename));
		} catch (Exception e) {
			if (e instanceof FileAlreadyExistsException) {
				throw new RuntimeException("A file of that name already exists.");
			}

			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void append(String filename, MultipartFile file) {
		try {
			Files.write(
					root.resolve(filename),
					file.getBytes(),
					StandardOpenOption.APPEND);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void save(Document document) {
		DocumentEntity documentEntity = documentMapper.toDocumentEntity(document);
		documentRepository.save(documentEntity);
	}

	@Override
	public void update(String name, Document document) {
		DocumentEntity newDocumentEntity = documentMapper.toDocumentEntity(document);
		DocumentEntity documentEntity = documentRepository.findByName(name).orElseThrow(() ->
				new DocumentNotFoundException("Document with name " + name + " not found", name));

		Utils.copyNonNullValues(documentEntity, newDocumentEntity);
		documentRepository.save(documentEntity);
	}

	@Override
	public Resource load(String filename) {
		try {
			Path file = root.resolve(filename);
			Resource resource = new UrlResource(file.toUri());

			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new DocumentContentNotFoundException("Could not read the file!", filename);
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(root.toFile());
	}

	@Override
	public List<Document> findAllDocuments() {
		return documentRepository.findAll().stream().map(documentMapper::toDocument).toList();

	}

}
