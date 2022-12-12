package com.rse.recipesearchengine;

import com.rse.recipesearchengine.application.port.out.DocumentStorage;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class RecipeSearchEngineApplication implements CommandLineRunner {

	private final DocumentStorage documentStorage;

	public static void main(String[] args) {
		SpringApplication.run(RecipeSearchEngineApplication.class, args);
	}

	@Override
	public void run(String... arg) {
//		documentStorage.deleteAll();
		documentStorage.init();
	}

}
