package com.rse.recipesearchengine.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "DOCUMENTS")
@Getter
@Setter
@NoArgsConstructor
public class DocumentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "CREATED_DATE")
	private LocalDateTime created;

	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modified;

}
