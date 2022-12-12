package com.rse.recipesearchengine.application.service;

import com.rse.recipesearchengine.application.port.in.command.RegisterUserCommand;
import com.rse.recipesearchengine.application.port.in.UserUseCase;
import com.rse.recipesearchengine.common.UseCase;
import com.rse.recipesearchengine.domain.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
@Transactional
public class UserService implements UserUseCase {

	@Override
	public User registerUser(RegisterUserCommand registerUserCommand) {
		return null;
	}

}
