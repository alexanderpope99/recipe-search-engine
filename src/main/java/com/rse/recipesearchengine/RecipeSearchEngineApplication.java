package com.rse.recipesearchengine;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class RecipeSearchEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeSearchEngineApplication.class, args);
	}

}
