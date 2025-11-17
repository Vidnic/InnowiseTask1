package com.viduk.ft.repository.specification.impl;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.specification.Specification;

public class IdSpecification implements Specification{

	private long id;
	
	public IdSpecification(long id) {
		this.id = id;
	}
	
	@Override
	public boolean specify(CustomArray array) {
		return this.id == array.getId();
	}
	
}
