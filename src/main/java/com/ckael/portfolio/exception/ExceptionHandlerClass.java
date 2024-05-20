package com.ckael.portfolio.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> ArgumentNotValidException(MethodArgumentNotValidException ex)
	{
		Map<String, String> errs = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->errs.put(error.getField(), error.getDefaultMessage()));
		
		return new ResponseEntity<>(errs,new HttpHeaders(),HttpStatus.UNPROCESSABLE_ENTITY);		
	}
	
}
