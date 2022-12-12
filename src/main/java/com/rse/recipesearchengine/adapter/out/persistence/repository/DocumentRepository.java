package com.rse.recipesearchengine.adapter.out.persistence.repository;

import com.rse.recipesearchengine.adapter.out.persistence.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {

	Optional<DocumentEntity> findByName(String filename);

}

