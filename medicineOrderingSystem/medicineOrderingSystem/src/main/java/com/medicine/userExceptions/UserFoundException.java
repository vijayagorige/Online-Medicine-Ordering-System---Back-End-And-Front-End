package com.medicine.userExceptions;

public class UserFoundException  extends Exception{

	public UserFoundException() {
		super("This user id is already present in database");
	}

	public UserFoundException(String message) {
		super(message);
	}
}
