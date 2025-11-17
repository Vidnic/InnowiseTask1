package com.viduk.ft.specification.impl;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;
import com.viduk.ft.service.impl.CustomArraySearchServiceImpl;

public class SumSpecification implements Specification {

	private int sum;
	
	@Override
	public boolean specify(CustomArray array) {
		CustomArraySearchServiceImpl searchServise = new CustomArraySearchServiceImpl();
		return sum == searchServise.findSum(array);
	}

}
