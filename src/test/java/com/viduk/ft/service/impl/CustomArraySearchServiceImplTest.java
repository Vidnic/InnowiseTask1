package com.viduk.ft.service.impl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.Arrays;

import com.viduk.ft.entity.CustomArray;

public class CustomArraySearchServiceImplTest {
	
	CustomArray array;
	
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
	
	@Test
	void findAverage() {
		int data[] = array.getData();
		OptionalDouble expected = Arrays.stream(data)
				 														.average();
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		OptionalDouble actual = service.findAverage(array);
		assertEquals(expected, actual);
	}
	
	@Test
	void findSum() {
		int data[] = array.getData();
		int expected = Arrays.stream(data)
												 .sum();
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		int actual = service.findSum(array);
		assertEquals(expected, actual);
	}
	
}
