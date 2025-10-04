package com.marketflow.user_service.domain.model;

import java.util.Objects;
import java.util.regex.Pattern;

import lombok.Getter;

@Getter
public class Email {
	private String value;
	
	private static Pattern EMAIL_REGEX =  Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");;
	
	public Email(String value) {
		if (!EMAIL_REGEX.matcher(value).matches()) {
			throw new IllegalArgumentException();
		}
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
		Email other = (Email) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Email [value=" + value + "]";
	}
	
	
	
}
