package com.viduk.ft.validator;

public interface CustomArrayValidator {

	public static final String NUMERIC_DATA_PREFIX_REGEX = "-?\\d+";
	
	boolean checkCustomArrayString(String[] parsedLine);
	
}
