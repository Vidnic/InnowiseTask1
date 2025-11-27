package com.viduk.ft.repository;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.comparator.CustomArraySumComparator;
import com.viduk.ft.specification.impl.*;

class CustomArrayRepositoryTest {

	CustomArrayRepository repository = CustomArrayRepository.getInstance();
	CustomArray arr1 = CustomArray.newBuilder()
			.setId(1L)
			.setData(new int[] { 15, 29 })
			.build();
	CustomArray arr2 = CustomArray.newBuilder()
			.setId(2L)
			.setData(new int[] { 11, 24, 33, 41 })
			.build();
	CustomArray arr3 = CustomArray.newBuilder()
			.setId(3L)
			.setData(new int[] { 49, 43, 3, 1 })
			.build();
	
	@Test
	void testAddAndSort() {
		repository.add(arr2);
		repository.add(arr3);
		repository.add(arr1);
		List<CustomArray> sorted = repository.sort(new CustomArraySumComparator());
		assertEquals(3, sorted.size());
		assertEquals(arr1, sorted.get(0));
		assertEquals(arr2, sorted.get(2));
		assertEquals(arr3, sorted.get(1));
	}
	@Test
	void testSpecifications() {
		List<CustomArray> results1 = repository.queryStream(new MaxElementLesserThenValueSpecification(45));
		List<CustomArray> results2 = repository.queryStream(new MinElementGreaterThenValueSpecification(10));
		List<CustomArray> results3 = repository.queryStream(new SumEqualSpecification(44));
		List<CustomArray> list1 = List.of(arr2, arr1);
		List<CustomArray> list2 = List.of(arr2, arr1);
		List<CustomArray> list3 = List.of(arr1);
		assertEquals(list1, results1);
		assertEquals(list2, results2);
		assertEquals(list3, results3);
	}
}
