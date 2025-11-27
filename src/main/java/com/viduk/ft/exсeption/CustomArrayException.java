package com.viduk.ft.exсeption;

public class CustomArrayException extends Exception {

	private static final long serialVersionUID = 6271888703433909785L;

	public CustomArrayException() {
		super();
	}
	public CustomArrayException(String message) {
		super(message);
	}
	public CustomArrayException(String message, Throwable cause) {
    super(message, cause);
}
}
