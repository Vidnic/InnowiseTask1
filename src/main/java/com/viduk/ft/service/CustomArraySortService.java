package com.viduk.ft.service;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.exсeption.CustomArrayException;

public interface CustomArraySortService {
	
	void bubbleSort(CustomArray array) throws CustomArrayException;
	
	void insertionSort(CustomArray array) throws CustomArrayException;
	
	void mergeSort(CustomArray array) throws CustomArrayException;
	
}
