package com.marketflow.user_service.infrastructure.dtos.input;

public record SignUpUserDTO(
		String userName,
		String password,
		String confirmPassword,
		String email
		) {

}
