package com.viduk.ft.service.impl;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.service.CustomArraySearchService;

public class CustomArraySearchServiceImpl implements CustomArraySearchService {

	@Override
	public OptionalInt findMax(CustomArray array) {
		OptionalInt max = OptionalInt.empty();
		if (array.size() > 0) {
			max = array.stream()
								 .max();
		}
		return max;
	}

	@Override
	public OptionalInt findMin(CustomArray array) {
		OptionalInt min = OptionalInt.empty();
		if (array.size() > 0) {
			min = array.stream()
								 .min();
		}
		return min;
	}

	@Override
	public OptionalDouble findAverage(CustomArray array) {
		OptionalDouble average = OptionalDouble.empty();
		if (array.size() > 0) {
			average = array.stream().average();
		}
		return average;
	}

	@Override
	public int findSum(CustomArray array) {
		return array.stream()
								.sum();
	}
	
	@Override
	public long findCountOfNegatives(CustomArray array) {
		return array.stream()
								.filter(el -> el < 0)
								.sum();
	}
	
	@Override
	public long findCountOfPositives(CustomArray array) {
		return array.stream()
								.filter(el -> el > 0)
								.count();
	}

}
