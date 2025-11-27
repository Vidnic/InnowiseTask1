package com.viduk.ft.service.impl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.exсeption.CustomArrayException;

public class CustomArraySortServiceImplTest {

	CustomArray actual;
	CustomArraySortServiceImpl service = new CustomArraySortServiceImpl();;

	@BeforeEach
	void setUp() {
		actual = new CustomArray(1, new int[] { 42, -7, 88, 2, -33, 19, -15, 61, -3, 10 });
	}

	@Test
	void bubbleSort() {
		CustomArray expected = new CustomArray(1, new int[] { -33, -15, -7, -3, 2, 10, 19, 42, 61, 88 });
		try {
			service.bubbleSort(actual);
		} catch (CustomArrayException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}

	@Test
	void insertionSort() {
		CustomArray expected = new CustomArray(1, new int[] { -33, -15, -7, -3, 2, 10, 19, 42, 61, 88 });
		try {
			service.insertionSort(actual);
		} catch (CustomArrayException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}

	@Test
	void mergeSort() {
		CustomArray expected = new CustomArray(1, new int[] { -33, -15, -7, -3, 2, 10, 19, 42, 61, 88 });
		try {
			service.mergeSort(actual);
		} catch (CustomArrayException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
}