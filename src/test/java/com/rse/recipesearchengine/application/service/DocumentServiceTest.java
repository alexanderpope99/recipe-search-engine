package com.rse.recipesearchengine.application.service;

import com.rse.recipesearchengine.application.event.DocumentCreatedEvent;
import com.rse.recipesearchengine.application.event.DocumentUpdatedEvent;
import com.rse.recipesearchengine.application.exception.DocumentNotFoundException;
import com.rse.recipesearchengine.application.port.out.DocumentEventPublisher;
import com.rse.recipesearchengine.application.port.out.DocumentStorage;
import com.rse.recipesearchengine.domain.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class DocumentServiceTest {

	@Mock
	DocumentStorage documentStorage;

	@Mock
	DocumentEventPublisher documentEventPublisher;

	@InjectMocks
	DocumentService documentService;

	@Mock
	Document document;

	@Mock
	MultipartFile file;

	@Mock
	MultipartFile invalidFile;

	@BeforeEach
	void init() {
		document = Mockito.mock(Document.class);
		when(document.getName()).thenReturn("doc.json");
		when(document.getCreated()).thenReturn(LocalDateTime.of(2017, 2, 13, 15, 56));
		when(document.getModified()).thenReturn(LocalDateTime.of(2017, 2, 15, 15, 56));

		when(documentStorage.find("doc.json")).thenReturn(Optional.of(document));
		when(documentStorage.find("x.json")).thenReturn(Optional.empty());
		when(documentStorage.findAllDocuments()).thenReturn(List.of(document));

		file = Mockito.mock(MultipartFile.class);
		when(file.getOriginalFilename()).thenReturn("doc.json");

		invalidFile = Mockito.mock(MultipartFile.class);
		when(invalidFile.getOriginalFilename()).thenReturn(null);
	}

	@Test
	public void Get_Returns_Document_When_Found() {
		Document document = documentService.get("doc.json");

		assertEquals(document, document);
	}

	@Test
	public void Get_Throws_Exception_When_Not_Found() {
		Exception exception = assertThrows(DocumentNotFoundException.class, () ->
				documentService.get("x.json"));
		assertEquals("Document with name: x.json not found", exception.getMessage());
	}

	@Test
	public void Save_Returns_Document_When_File_Valid() {
		Document document = documentService.save(file);

		verify(documentStorage, times(1)).save(any(MultipartFile.class));
		verify(documentEventPublisher, times(1)).publishDocumentCreatedEvent(any(DocumentCreatedEvent.class));
		assertEquals("doc.json", document.getName());
		assertNotNull(document.getCreated());
	}

	@Test
	public void Save_Throws_Exception_When_Filename_Null() {
		assertThrows(NullPointerException.class, () ->
				documentService.save(invalidFile));
		verify(documentStorage, times(0)).save(any(MultipartFile.class));
		verify(documentEventPublisher, times(0)).publishDocumentCreatedEvent(any(DocumentCreatedEvent.class));
	}

	@Test
	public void Append_Content_Finishes() {
		documentService.appendContent("doc.json", file);

		verify(documentStorage, times(1)).append("doc.json", file);
		verify(documentEventPublisher, times(1)).publishDocumentUpdatedEvent(any(DocumentUpdatedEvent.class));
		verify(document, times(1)).setModified(any(LocalDateTime.class));
	}

	@Test
	public void Append_Content_Throws_Exception() {
		Exception exception = assertThrows(DocumentNotFoundException.class, () ->
				documentService.appendContent("x.json", file));
		assertEquals("Document with name: x.json not found", exception.getMessage());
	}

	@Test
	public void Loads_Returns_Documents() {
		List<Document> documents = documentService.loadAll();

		assertEquals(documents.size(), 1);
		assertEquals(documents.get(0), document);
	}

}
