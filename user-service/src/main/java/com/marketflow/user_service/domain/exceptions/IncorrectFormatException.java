package com.marketflow.user_service.domain.exceptions;

public class IncorrectFormatException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	
	public IncorrectFormatException(String description) {
		this.description = description;
	}
	
	public String getDescription() {return description;}
}
