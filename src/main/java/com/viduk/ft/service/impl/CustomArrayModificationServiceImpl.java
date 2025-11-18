package com.viduk.ft.service.impl;

import java.util.function.IntPredicate;

import com.viduk.ft.entity.CustomArray;
import com.viduk.ft.service.CustomArrayModificationService;

public class CustomArrayModificationServiceImpl implements CustomArrayModificationService {

	@Override
	public void replaceUnderCondition(CustomArray array, IntPredicate condition, int newValue) {
		int[] modified = array.stream()
        									.map(el -> condition.test(el) ? newValue : el)
        									.toArray();
		array.setData(modified);
	}
	
}