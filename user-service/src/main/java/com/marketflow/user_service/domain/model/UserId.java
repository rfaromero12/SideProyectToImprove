package com.marketflow.user_service.domain.model;

import java.util.Objects;
import java.util.UUID;

import lombok.Getter;

@Getter
public class UserId {
	private UUID value;
	
	public UserId(UUID value) {
		this.value = value;
	}


	public static UserId generateNewId() {
		return new UserId(UUID.randomUUID());
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "UserId [value=" + value + "]";
	}
	
	
	
	
}
