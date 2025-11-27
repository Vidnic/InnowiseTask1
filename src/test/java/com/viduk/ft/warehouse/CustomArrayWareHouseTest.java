package com.viduk.ft.warehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.viduk.ft.entity.CustomArrayStatistics;

class CustomArrayWareHouseTest {

	CustomArrayWareHouse warehouse = CustomArrayWareHouse.getInstance();
	
	@BeforeEach
	void setUp() {
		CustomArrayStatistics statistics = new CustomArrayStatistics(3, 5, 1);
		warehouse.put(0, statistics);
	}

	@Test
	void getStatisticsNull() {
		CustomArrayStatistics expected = null;
		CustomArrayStatistics actual = warehouse.get(5);
		assertEquals(expected, actual);
	}
	
	@Test
	void getStatistics() {
		CustomArrayStatistics expected = new CustomArrayStatistics(3, 5, 1);;
		CustomArrayStatistics actual = warehouse.get(0);
		assertEquals(expected, actual);
	}

}