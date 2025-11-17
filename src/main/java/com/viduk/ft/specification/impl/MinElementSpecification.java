package com.viduk.ft.specification.impl;

import java.util.OptionalInt;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;
import com.viduk.ft.service.impl.CustomArraySearchServiceImpl;

public class MinElementSpecification implements Specification {

	private OptionalInt min;
	
	public MinElementSpecification(int min) {
		this.min = OptionalInt.of(min);
	}
	
	@Override
	public boolean specify(CustomArray array) {
		CustomArraySearchServiceImpl service = new CustomArraySearchServiceImpl();
		return min == service.findMin(array);
	}

}
