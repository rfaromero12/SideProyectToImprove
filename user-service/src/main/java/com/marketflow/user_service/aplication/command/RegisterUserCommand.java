package com.marketflow.user_service.aplication.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RegisterUserCommand {
	private String name;
	private String email;
	private String password;
	private String confirmPassword;

}
