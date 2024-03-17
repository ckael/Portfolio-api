package com.ckael.portfolio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ckael.portfolio.model.ExceptionModel;

@RestControllerAdvice
public class ExceptionHandlerClass {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> NotFoundException(NotFoundException ex)
	{
		ExceptionModel e = new ExceptionModel(ex.getMessage(),404,"Not Found");
		
		return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);		
	}
	
	@ExceptionHandler(DataConflictException.class)
	public ResponseEntity<Object> DataConflictException(DataConflictException ex)
	{
		ExceptionModel e = new ExceptionModel(ex.getMessage(),409,"Conflict");
		return new ResponseEntity<>(e,HttpStatus.CONFLICT);
	}
	
}
