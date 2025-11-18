package com.viduk.ft.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;

public class Repository{
	
	private static final Logger log = LogManager.getLogger();
	private List<CustomArray> CustomArrays;
	
	public Repository() {
		log.log(Level.INFO, "Repository was created");
		CustomArrays = new ArrayList<CustomArray>();
	}
	
	public Repository(List<CustomArray> list) {
		this.CustomArrays = list;
		log.log(Level.INFO, "Repository was created");
	}
	
	public void add(CustomArray array) {
		CustomArrays.add(array);
	}
	
	public CustomArray remove(int index) {
		return CustomArrays.remove(index);
	}
	
	public boolean remove(CustomArray array) {
		return CustomArrays.remove(array);
	}
	
	public List<CustomArray> query(Specification specification){
		List<CustomArray> results = new ArrayList<CustomArray>();
		for(CustomArray array : CustomArrays) {
			if(specification.specify(array)) {
				CustomArrays.add(array);
			}
		}
		log.log(Level.INFO, "query is done");
		return results;
	}
	
	public List<CustomArray> queryStream(Specification specification){
		List<CustomArray> results;
		results = CustomArrays.stream()
													.filter(ar -> specification.specify(ar))
													.collect(Collectors.toList());
		log.log(Level.INFO, "qury is done");
		return results;
	}
}
