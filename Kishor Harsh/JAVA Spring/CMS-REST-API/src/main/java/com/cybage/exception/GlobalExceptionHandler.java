package com.cybage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleException(CustomerNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}

}
