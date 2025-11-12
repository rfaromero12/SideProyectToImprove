package com.marketflow.user_service.aplication.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LoginUserCommand {
	private String email;
	private String password;
}
