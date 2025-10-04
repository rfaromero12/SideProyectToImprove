package com.marketflow.user_service.infrastructure.persistance.adapter;

import org.springframework.stereotype.Service;

import com.marketflow.user_service.domain.model.User;
import com.marketflow.user_service.domain.port.UserPort;
import com.marketflow.user_service.infrastructure.persistance.entity.UserEntity;
import com.marketflow.user_service.infrastructure.persistance.mapper.UserMapper;
import com.marketflow.user_service.infrastructure.persistance.repository.UserRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserAdapter implements UserPort{

	private UserRepository repository;
	
	public UserAdapter(UserRepository userRepository) {
		repository = userRepository;
	}
	
	@Override
	public boolean existsByEmail(String email) {
		return repository.existsByEmail(email);
	}

	@Override
	public User save(User user) {
		log.info("Creando nuevo usuario con ID " + user.getUserId().getValue());
		UserEntity entity = UserMapper.fromDomainToSchema(user);
		return UserMapper.fromSchemaToDomain(repository.save(entity));
	}

}
