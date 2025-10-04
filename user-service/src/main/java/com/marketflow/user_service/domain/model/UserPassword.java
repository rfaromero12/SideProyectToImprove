package com.marketflow.user_service.domain.model;

import java.util.Objects;

import lombok.Getter;

@Getter
public class UserPassword {

	private String value;
	
	public UserPassword(String value){
		this.value = value;
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
		UserPassword other = (UserPassword) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "UserPassword [value=" + value + "]";
	}
	
	
}
