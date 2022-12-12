package com.rse.recipesearchengine.application.port.in.command;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class RegisterUserCommand {

	@NotNull
	@NotEmpty
	String firstName;

	@NotNull
	@NotEmpty
	String lastName;

	@NotNull
	@NotEmpty
	String email;

	@NotNull
	@NotEmpty String password;

	@NotNull
	@NotEmpty
	String matchingPassword;

}
