package com.viduk.ft.comparator;

import java.util.Comparator;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.service.impl.CustomArraySearchServiceImpl;

public class CustomArraySumComparator implements Comparator<CustomArray> {

	@Override
	public int compare(CustomArray array1, CustomArray array2) {
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		return Integer.compare(service.findSum(array1), service.findSum(array2));
	}

}