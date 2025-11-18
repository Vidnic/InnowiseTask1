package com.viduk.ft.service.impl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.viduk.ft.entity.CustomArray;

public class CustomArrayModificationServiceImplTest {

	CustomArray actual;
	
	@BeforeEach
	void setUp() {
		actual = new CustomArray(1, new int[] {42, -7, 19, -3, 88, -15, 61, 2, -33, 10});
	}
	
	@AfterEach
	void setDown(){
		
	}

	@Test
	void replaceUnderCondition() {
		CustomArray expected = new CustomArray (1, new int[] {42, 0, 19, 0, 88, 0, 61, 2, 0, 10});
		CustomArrayModificationServiceImpl service = new CustomArrayModificationServiceImpl();
		service.replaceUnderCondition(actual, el -> el < 0, 0);
		assertEquals(expected, actual);
	}
	
}
