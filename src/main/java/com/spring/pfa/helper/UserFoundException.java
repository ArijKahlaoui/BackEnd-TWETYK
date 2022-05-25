package com.spring.pfa.helper;

public class UserFoundException extends Exception{
	
	public UserFoundException() {
		super("User with this username already exist");
	}
	
	public UserFoundException(String msg) {
		super(msg);
	}

}
