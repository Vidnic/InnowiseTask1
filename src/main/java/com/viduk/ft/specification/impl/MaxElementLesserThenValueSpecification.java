package com.viduk.ft.specification.impl;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;
import com.viduk.ft.service.impl.CustomArraySearchServiceImpl;

public class MaxElementLesserThenValueSpecification implements Specification{

	private int max;
	
	public MaxElementLesserThenValueSpecification(int max) {
		this.max = max;
	}
	@Override
	public boolean specify(CustomArray array) {
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		return service.findMax(array).getAsInt() < max;
	}
}
