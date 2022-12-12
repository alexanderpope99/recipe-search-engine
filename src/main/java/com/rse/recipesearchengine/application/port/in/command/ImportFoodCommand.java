package com.rse.recipesearchengine.application.port.in.command;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ImportFoodCommand {

	@NotNull
	String filename;

}
