package com.marketflow.user_service.infrastructure.persistance.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "Users")
public class UserEntity {

	@Id
	private UUID userId;
	
	private String email;
	
	private String password;
	
	private String name;
	
}
