package com.viduk.ft.comparator;

import java.util.Comparator;

import com.viduk.ft.entity.CustomArray;

public class CustomArrayIdComparator implements Comparator<CustomArray> {
	@Override
	public int compare(CustomArray array1, CustomArray array2) {
		return Long.compare(array1.getId(), array2.getId());
	}
}