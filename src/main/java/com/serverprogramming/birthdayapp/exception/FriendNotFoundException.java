package com.serverprogramming.birthdayapp.exception;

public class FriendNotFoundException extends RuntimeException {
	
	public FriendNotFoundException(Long id) {
		super("Could not find friend with id " + id);
	}
}
