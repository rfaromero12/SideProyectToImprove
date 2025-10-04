package com.marketflow.user_service.infrastructure.persistance.mapper;

import com.marketflow.user_service.domain.model.Email;
import com.marketflow.user_service.domain.model.User;
import com.marketflow.user_service.domain.model.UserId;
import com.marketflow.user_service.domain.model.UserName;
import com.marketflow.user_service.domain.model.UserPassword;
import com.marketflow.user_service.infrastructure.persistance.entity.UserEntity;

public class UserMapper {
	public static UserEntity fromDomainToSchema(User user) {
		return UserEntity.builder().
				email(user.getEmail().getValue()).
				name(user.getName().getValue()).
				password(user.getPassword().getValue()).
				userId(user.getUserId().getValue()).
				build();
		
	}
	
	public static User fromSchemaToDomain(UserEntity entity) {
		return User.builder().
				email(new Email(entity.getEmail())).
				name(new UserName(entity.getName())).
				password(new UserPassword(entity.getPassword())).
				userId(new UserId(entity.getUserId())).
				build();
	}
}
