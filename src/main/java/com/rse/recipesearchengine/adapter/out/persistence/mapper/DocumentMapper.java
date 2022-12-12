package com.rse.recipesearchengine.adapter.out.persistence.mapper;

import com.rse.recipesearchengine.adapter.out.persistence.entity.DocumentEntity;
import com.rse.recipesearchengine.domain.Document;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DocumentMapper {

	Document toDocument(DocumentEntity documentEntity);

	@Mapping(target = "id", ignore = true)
	DocumentEntity toDocumentEntity(Document document);

}
