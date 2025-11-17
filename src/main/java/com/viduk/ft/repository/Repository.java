package com.viduk.ft.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;

public class Repository{
	
	private List<CustomArray> CustomArrays;
	
	public Repository() {
		CustomArrays = new ArrayList<CustomArray>();
	}
	
	public Repository(List<CustomArray> list) {
		this.CustomArrays = list;
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
		return results;
	}
	
	public List<CustomArray> queryStream(Specification specification){
		List<CustomArray> results;
		results = CustomArrays.stream()
													.filter(ar -> specification.specify(ar))
													.collect(Collectors.toList());
		return results;
	}
	
}
