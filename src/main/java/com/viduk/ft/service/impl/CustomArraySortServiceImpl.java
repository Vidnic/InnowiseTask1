package com.viduk.ft.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.*;
import com.viduk.ft.exсeption.*;
import com.viduk.ft.service.*;

public class CustomArraySortServiceImpl implements CustomArraySortService {

	private static final Logger log = LogManager.getLogger();

	@Override
	public void bubbleSort(CustomArray array) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void insertionSort(CustomArray array) throws CustomArrayException {

		if (array.size() == -1) {
			log.error("CustomArray is null or invalid");
			throw new CustomArrayException("CustomArray is null");
		}
		for (int i = 1; i < array.size(); i++) {
			int j, temp = array.get(i);
			for (j = i; j > 0 && temp < array.get(j - 1); j--) {
				array.set(j, array.get(j - 1));
			}
			array.set(j, temp);
		}
		log.debug("CustomArray has sorted", array);

	}

	@Override
	public void mergeSort(CustomArray array) {
		throw new UnsupportedOperationException();

	}

}
