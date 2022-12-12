package com.rse.recipesearchengine.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Document {

	@NonNull
	private String name;

	private LocalDateTime created = LocalDateTime.now();

	private LocalDateTime modified;

}
