package com.expensemgr.exceptions;

public class NoSuchExpenseFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6474660956789324821L;

	public NoSuchExpenseFoundException(String message) {
		super(message);
	}
}
