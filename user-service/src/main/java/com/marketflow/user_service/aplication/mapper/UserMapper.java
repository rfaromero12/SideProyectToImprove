package com.marketflow.user_service.aplication.mapper;

import com.marketflow.user_service.aplication.output.UserDTO;
import com.marketflow.user_service.domain.model.User;

public class UserMapper {
	public static UserDTO fromDomainToOut(User user) {
		return new UserDTO(
				user.getUserId().getValue().toString(),
				user.getName().getValue(),
				user.getPassword().getValue(),
				user.getEmail().getValue());
	}
}
