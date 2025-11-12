package com.marketflow.user_service.infrastructure.persistance.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.marketflow.user_service.infrastructure.persistance.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{

	@Query("SELECT m FROM USERS WHERE m.email = :email")
	@Modifying
	boolean existsByEmail(String email);

	@Query("SELECT m FROM USERS WHERE m.email = :email")
	UserEntity findByEmail(@Param("email") String email);

}
