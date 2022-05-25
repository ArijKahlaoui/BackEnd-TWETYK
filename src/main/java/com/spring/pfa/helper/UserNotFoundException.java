package com.spring.pfa.helper;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		super("User with this Username not found in database");
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
