package com.rse.recipesearchengine.adapter.in.web.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
public class FileInfo {

	private String name;

	private LocalDateTime created;

	private LocalDateTime modified;

	private String url;

}
