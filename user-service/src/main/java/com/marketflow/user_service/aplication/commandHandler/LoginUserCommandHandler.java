package com.marketflow.user_service.aplication.commandHandler;

import org.springframework.stereotype.Service;

import com.marketflow.user_service.aplication.command.LoginUserCommand;
import com.marketflow.user_service.aplication.mapper.UserMapper;
import com.marketflow.user_service.aplication.output.UserDTO;
import com.marketflow.user_service.domain.exceptions.PasswordNotEquals;
import com.marketflow.user_service.domain.exceptions.UserNotFound;
import com.marketflow.user_service.domain.model.Email;
import com.marketflow.user_service.domain.model.User;
import com.marketflow.user_service.domain.model.UserPassword;
import com.marketflow.user_service.domain.port.UserPort;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class LoginUserCommandHandler {

	private UserPort userPort;
	
	public LoginUserCommandHandler(UserPort port) {
		userPort = port;
	}
	
	public UserDTO handle(LoginUserCommand command) {
		UserPassword password = new UserPassword(command.getPassword());
		Email email = new Email(command.getEmail());
		
		if (!userPort.existsByEmail(email.getValue()))
			throw new UserNotFound();
		
		
		User user = userPort.findUserByEmail(email.getValue());
		
		if (password.equals(user.getPassword()))
			throw new PasswordNotEquals();

		
		return UserMapper.fromDomainToOut(user);
				
	}
}
