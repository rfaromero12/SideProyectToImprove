package com.marketflow.user_service.infrastructure.persistance.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketflow.user_service.infrastructure.persistance.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{

	boolean existsByEmail(String email);

}
