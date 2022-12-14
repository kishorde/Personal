package com.cybage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> handleException(RecordNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<String> handleException(InvalidInputException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	

}
