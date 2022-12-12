package com.rse.recipesearchengine.common;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Optional;

public class Utils {

	public static File multipartToFile(MultipartFile multipart, String fileName) throws IllegalStateException, IOException {
		File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + fileName);
		multipart.transferTo(convFile);
		return convFile;
	}

	public static Optional<String> getExtensionByStringHandling(String filename) {
		return Optional.ofNullable(filename)
				.filter(f -> f.contains("."))
				.map(f -> f.substring(filename.lastIndexOf(".") + 1));
	}

	public static void copyNonNullValues(Object destination, Object source) {
		try {
			for (Field field : source.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				String name = field.getName();
				Object value = field.get(source);

				//If it is a non null value copy to destination
				if (null != value) {

					Field destField = destination.getClass().getDeclaredField(name);
					destField.setAccessible(true);

					destField.set(destination, value);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
