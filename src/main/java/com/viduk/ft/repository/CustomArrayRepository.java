package com.viduk.ft.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;

public class CustomArrayRepository {

	private static final Logger log = LogManager.getLogger();
	private static CustomArrayRepository instance = new CustomArrayRepository();
	private List<CustomArray> customArrays = new ArrayList<>();
	
	private CustomArrayRepository() {
	}

	public static CustomArrayRepository getInstance() {
		return instance;
	}

	public void add(CustomArray array) {
		customArrays.add(array);
	}

	public CustomArray remove(int index) {
		return customArrays.remove(index);
	}

	public boolean remove(CustomArray array) {
		return customArrays.remove(array);
	}

	public List<CustomArray> sort(Comparator<CustomArray> comparator) {
		List<CustomArray> sorted = new ArrayList<>(customArrays);
		sorted.sort(comparator);
		log.info("sorting query is done");
		return sorted;
	}

	public List<CustomArray> query(Specification specification) {
		List<CustomArray> results = new ArrayList<CustomArray>();
		for (CustomArray array : customArrays) {
			if (specification.specify(array)) {
				results.add(array);
			}
		}
		log.log(Level.INFO, "query is done");
		return results;
	}

	public List<CustomArray> queryStream(Specification specification) {
		List<CustomArray> results;
		results = customArrays.stream()
													.filter(ar -> specification.specify(ar))
													.collect(Collectors.toList());
		log.log(Level.INFO, "qury is done");
		return results;
	}
}
