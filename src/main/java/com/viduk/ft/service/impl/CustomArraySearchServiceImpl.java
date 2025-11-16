package com.viduk.ft.service.impl;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.service.CustomArraySearchService;

public class CustomArraySearchServiceImpl implements CustomArraySearchService {

	@Override
	public OptionalInt findMax(CustomArray array) {
		OptionalInt max = OptionalInt.empty();
		if(array.size() > 0) {
			max = array.stream()
					 			 .max();
		}
		return max;
	}

	@Override
	public OptionalInt findMin(CustomArray array) {
		OptionalInt min = OptionalInt.empty();
		if(array.size() > 0) {
			min = array.stream()
								 .min();
		}
		return min;
	}

	@Override
	public OptionalDouble findAverage(CustomArray array) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
