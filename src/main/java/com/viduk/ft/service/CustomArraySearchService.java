package com.viduk.ft.service;

import java.util.OptionalInt;
import java.util.OptionalDouble;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.exсeption.CustomArrayException;

public interface CustomArraySearchService {

	OptionalInt findMax(CustomArray array) throws CustomArrayException;
	OptionalInt findMin(CustomArray array) throws CustomArrayException;
	OptionalDouble findAverage(CustomArray array);
	
}
