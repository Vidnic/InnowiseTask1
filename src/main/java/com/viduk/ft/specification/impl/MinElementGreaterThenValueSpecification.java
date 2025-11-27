package com.viduk.ft.specification.impl;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;
import com.viduk.ft.service.impl.CustomArraySearchServiceImpl;

public class MinElementGreaterThenValueSpecification implements Specification {

	private int min;
	
	public MinElementGreaterThenValueSpecification(int min) {
		this.min = min;
	}
	
	@Override
	public boolean specify(CustomArray array) {
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		return service.findMin(array).getAsInt() > min;
	}
}