package com.marketflow.user_service.aplication.commandHandler;

import org.springframework.stereotype.Service;

import com.marketflow.user_service.aplication.command.RegisterUserCommand;
import com.marketflow.user_service.aplication.output.UserDTO;
import com.marketflow.user_service.domain.exceptions.PasswordNotEquals;
import com.marketflow.user_service.domain.exceptions.UserEmailAlreadyExists;
import com.marketflow.user_service.domain.model.Email;
import com.marketflow.user_service.domain.model.User;
import com.marketflow.user_service.domain.model.UserName;
import com.marketflow.user_service.domain.model.UserPassword;
import com.marketflow.user_service.domain.port.UserPort;

@Service
public class RegisterUserCommandHandler {

	private UserPort userPort;
	
	public RegisterUserCommandHandler(UserPort port) {
		userPort = port;
	}
	
	public void handle(RegisterUserCommand command) {
		UserName name = new UserName(command.getName());
		UserPassword password = new UserPassword(command.getPassword());		
		UserPassword confirmPassword = new UserPassword(command.getConfirmPassword());		
		Email userEmail =new Email(command.getEmail());
		
		if (userPort.existsByEmail(userEmail.getValue()))
			throw new UserEmailAlreadyExists();
		
		
		if (!password.equals(confirmPassword))
			throw new PasswordNotEquals();
		
		User user = User.registerUser(name, password, userEmail);		
		
		userPort.save(user);
		
	}
	
}
