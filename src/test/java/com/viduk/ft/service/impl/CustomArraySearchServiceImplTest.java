package com.viduk.ft.service.impl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.OptionalInt;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.exсeption.CustomArrayException;

public class CustomArraySearchServiceImplTest {
	
	CustomArray array = new CustomArray(1, new int[] {42, -7, 19, -3, 88, -15, 61, 2, -33, 10});
	
	@BeforeEach
	void setUp() {
		array = new CustomArray(1, new int[] {42, -7, 19, -3, 88, -15, 61, 2, -33, 10});
	}
	
	@AfterEach
	void setDown(){
		
	}

	@Test
	void findMax() {
		OptionalInt expected = OptionalInt.of(88);
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		OptionalInt actual = service.findMax(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void findMin() {
		OptionalInt expected = OptionalInt.of(-33);
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		OptionalInt actual = service.findMin(array);
		assertEquals(expected, actual);
	}
	
}
