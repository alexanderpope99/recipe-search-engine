package com.rse.recipesearchengine.application.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
@AllArgsConstructor
public abstract class DataMiner<T> {

	@NonNull
	protected File file;

	abstract public T extractData() throws IOException;
}
