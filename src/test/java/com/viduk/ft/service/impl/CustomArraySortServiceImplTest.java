package com.viduk.ft.service.impl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.exсeption.CustomArrayException;

public class CustomArraySortServiceImplTest {
	
	CustomArray actual = new CustomArray(1, new int[] {42, -7, 19, -3, 88, -15, 61, 2, -33, 10});
	
	@BeforeEach
	void setUp() {
		
	}
	
	@AfterEach
	void setDown(){
		
	}

	@Test
	void insertionSort() {
		CustomArray expected = new CustomArray(1, new int[]{-33, -15, -7, -3, 2, 10, 19, 42, 61, 88});
		CustomArraySortServiceImpl service = new CustomArraySortServiceImpl();
		try {
			service.insertionSort(actual);
		} catch (CustomArrayException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
}
