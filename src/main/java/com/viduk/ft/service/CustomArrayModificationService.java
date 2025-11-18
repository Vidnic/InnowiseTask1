package com.viduk.ft.service;

import java.util.function.IntPredicate;

import com.viduk.ft.entity.CustomArray;

public interface CustomArrayModificationService {

	void replaceUnderCondition (CustomArray array, IntPredicate condition, int newValue);
	
}
