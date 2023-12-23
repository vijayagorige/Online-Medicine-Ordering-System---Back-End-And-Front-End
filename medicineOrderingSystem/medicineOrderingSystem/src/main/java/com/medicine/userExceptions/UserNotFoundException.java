package com.medicine.userExceptions;

public class UserNotFoundException extends Exception{

	public UserNotFoundException() {
		super("This user is not Registered");
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}
