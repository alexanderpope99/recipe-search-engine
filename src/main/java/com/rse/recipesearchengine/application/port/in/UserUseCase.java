package com.rse.recipesearchengine.application.port.in;

import com.rse.recipesearchengine.application.port.in.command.RegisterUserCommand;
import com.rse.recipesearchengine.domain.User;

public interface UserUseCase {

	User registerUser(RegisterUserCommand registerUserCommand);

}
