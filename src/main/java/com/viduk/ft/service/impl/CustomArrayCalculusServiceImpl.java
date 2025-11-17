package com.viduk.ft.service.impl;

import java.util.OptionalInt;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.service.CustomArrayCalculusService;

public class CustomArrayCalculusServiceImpl implements CustomArrayCalculusService {

	@Override
	public int sum(CustomArray array) {
		return array.stream()
								.sum();
	}
	
}