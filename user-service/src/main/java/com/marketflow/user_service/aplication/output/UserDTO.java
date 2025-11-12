package com.marketflow.user_service.aplication.output;


public record UserDTO(
		String userId,
		String name,
		String password,
		String email ) {

}
