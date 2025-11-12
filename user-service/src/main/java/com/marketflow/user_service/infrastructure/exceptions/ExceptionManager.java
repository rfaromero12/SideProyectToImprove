package com.marketflow.user_service.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.marketflow.user_service.domain.exceptions.IncorrectFormatException;
import lombok.extern.log4j.Log4j2;


@RestControllerAdvice
@Log4j2
public class ExceptionManager {

	@ExceptionHandler(exception = IncorrectFormatException.class)
	@ResponseBody
	public ResponseEntity<ErrorDTO> handleFormatErrors(IncorrectFormatException exception) {
		log.info("Error en la validacion de campos: " + exception.getDescription());
		return new ResponseEntity<ErrorDTO>(new ErrorDTO(exception.getDescription()), HttpStatus.BAD_REQUEST);
	}
	
	
	
}
