package com.viduk.ft.repository.specification;

import com.viduk.ft.entity.CustomArray;

@FunctionalInterface
public interface Specification {

	boolean specify(CustomArray array);
	
}
