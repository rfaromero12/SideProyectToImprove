package com.marketflow.user_service.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
	private UserId userId;
	private UserName name;
	private UserPassword password;
	private UserPassword confirmPassword;
	private Email email;
	
	
	public boolean passwordNotEquals() {
		return !password.equals(confirmPassword);
	}


	public static User registerUser(UserName name, UserPassword password, Email userEmail) {
		return new User(UserId.generateNewId(), name, password, password, userEmail);
	}
}
