package com.sample.bookstore.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler
	public ResponseEntity<APIResponse> handleException(Exception e)
	{
		APIResponse apiResponse = new APIResponse();
		apiResponse.setError("Something Went Wrong! ");
		apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse);
	
	}
	
	
	@ExceptionHandler
	public ResponseEntity<APIResponse> handleException(BadRequestException e)
	{
		APIResponse apiResponse = new APIResponse();
		apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		apiResponse.setError(e.getErrors());
		return ResponseEntity.status(400).body(apiResponse);
	}

}
