package com.medicine.userExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler({UserNotFoundException.class})
	public ResponseEntity<?> HandleUserNotFoundException(UserNotFoundException ex)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
		
	}
	
	@ExceptionHandler({UserFoundException.class})
	public ResponseEntity<?> HandleUserFoundException(UserFoundException ex)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
	
	@ExceptionHandler({LengthException.class})
	public ResponseEntity<?> HandleLengthException(LengthException ex)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
}
