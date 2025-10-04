package com.marketflow.user_service.domain.model;

import java.util.Objects;

import lombok.Getter;

@Getter
public class UserName {
	private String value;

	public UserName(String value) {
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
		UserName other = (UserName) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "UserName [value=" + value + "]";
	}
	
	
}
