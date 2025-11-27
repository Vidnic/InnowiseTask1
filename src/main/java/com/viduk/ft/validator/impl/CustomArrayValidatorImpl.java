package com.viduk.ft.validator.impl;

import java.util.Arrays;

import com.viduk.ft.validator.CustomArrayValidator;

public class CustomArrayValidatorImpl implements CustomArrayValidator {

	@Override
	public boolean checkCustomArrayString(String[] parsedLine) {
		boolean check;
		check = Arrays.stream(parsedLine)
				.allMatch(s -> s.matches(NUMERIC_DATA_PREFIX_REGEX));
		return check;
	}
}