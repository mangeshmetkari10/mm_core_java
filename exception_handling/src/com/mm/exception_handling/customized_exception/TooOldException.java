package com.mm.exception_handling.customized_exception;

public class TooOldException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TooOldException(String message) {
		super(message);
	}
}
