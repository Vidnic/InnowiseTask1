package com.viduk.ft.specification;

import com.viduk.ft.entity.CustomArray;

@FunctionalInterface
public interface Specification {

	boolean specify(CustomArray array);
	
}
