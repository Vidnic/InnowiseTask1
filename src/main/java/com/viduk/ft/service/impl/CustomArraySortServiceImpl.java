package com.viduk.ft.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.*;
import com.viduk.ft.exсeption.*;
import com.viduk.ft.service.*;

public class CustomArraySortServiceImpl implements CustomArraySortService {

	private static final Logger log = LogManager.getLogger();

	@Override
	public void bubbleSort(CustomArray array) throws CustomArrayException {
		if (array.size().isEmpty()) {
			log.log(Level.ERROR, "CustomArray is null or invalid " + array);
			throw new CustomArrayException("CustomArray is null or invalid");
		}
		int size = array.size().getAsInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array.get(j) > array.get(j + 1)) {
					int temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
				}
			}
		}
		log.log(Level.INFO, "CustomArray has been sorted " + array);
	}
	@Override
	public void insertionSort(CustomArray array) throws CustomArrayException {

		if (array.size().isEmpty()) {
			log.log(Level.ERROR, "CustomArray is null or invalid" + array);
			throw new CustomArrayException("CustomArray is null or invalid");
		}
		int size = array.size().getAsInt();
		for (int i = 1; i < size; i++) {
			int j, temp = array.get(i);
			for (j = i; j > 0 && temp < array.get(j - 1); j--) {
				array.set(j, array.get(j - 1));
			}
			array.set(j, temp);
		}
		log.log(Level.INFO, "CustomArray has been sorted" + array);
	}

	@Override
	public void mergeSort(CustomArray array) throws CustomArrayException {

		if (array.size().isEmpty()) {
			log.log(Level.ERROR, "CustomArray is null or invalid " + array);
			throw new CustomArrayException("CustomArray is null or invalid");
		}
		mergeSortRecursive(array, 0, array.size().getAsInt() - 1);
		log.log(Level.INFO, "CustomArray has been sorted " + array);
	}

	private void mergeSortRecursive(CustomArray array, int left, int right) throws CustomArrayException {
		
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSortRecursive(array, left, mid);
			mergeSortRecursive(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	private void merge(CustomArray array, int left, int mid, int right) throws CustomArrayException {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = array.get(left + i);
		}
		for (int j = 0; j < n2; j++) {
			R[j] = array.get(mid + 1 + j);
		}
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array.set(k, L[i]);
				i++;
			} else {
				array.set(k, R[j]);
				j++;
			}
			k++;
		}
		while (i < n1) {
			array.set(k, L[i]);
			i++;
			k++;
		}
		while (j < n2) {
			array.set(k, R[j]);
			j++;
			k++;
		}
	}
}