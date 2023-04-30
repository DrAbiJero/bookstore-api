package com.sample.bookstore.common;

import java.util.List;

public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Errors> errors;

	public List<Errors> getErrors() {
		return errors;
	}

	public void setErrors(List<Errors> errors) {
		this.errors = errors;
	}


	public BadRequestException(String message, List<Errors> errors) {
		super(message);
		this.errors = errors;
	}

	

	  

}
