package com.sample.bookstore.common;

import org.springframework.stereotype.Component;

@Component
public class Errors
{
	private String target;
	private String message;
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Errors(String target, String message) {
		super();
		this.target = target;
		this.message = message;
	}
	public Errors() {
		super();
	}
	
	
}
