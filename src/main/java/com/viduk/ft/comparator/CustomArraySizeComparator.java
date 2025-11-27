package com.viduk.ft.comparator;

import java.util.Comparator;

import com.viduk.ft.entity.CustomArray;

public class CustomArraySizeComparator implements Comparator<CustomArray> {
	@Override
	public int compare(CustomArray array1, CustomArray array2) {
		int size1 = array1.size().getAsInt();
		int size2 = array2.size().getAsInt();
		return Integer.compare(size1, size2);
	}
}