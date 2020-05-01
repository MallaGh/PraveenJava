package com.practisejava.exceptions;

public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2900164334991059053L;

	public UserException(String message) {
		System.out.println(message);
	}
}

