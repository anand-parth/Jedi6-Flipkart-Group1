package com.flipkart.exception;

/**
 *
 * @author JEDI-6-Flipkart-G1
 * Exception to check if user exists 
 *
 */
public class UserNotFoundException extends Exception {

	private String userId;

	/***
	 * Getter function for UserId
	 * @param userId
	 */
	public UserNotFoundException(String userId) {
		this.userId = userId;
	}

	/**
	 * Message thrown by exception
	 */
	@Override
	public String getMessage() {
		return "User with userId: " + userId + " not found.";
	}

}