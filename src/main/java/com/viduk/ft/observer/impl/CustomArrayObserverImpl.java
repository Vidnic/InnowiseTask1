package com.viduk.ft.observer.impl;

import java.util.OptionalInt;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.*;
import com.viduk.ft.warehouse.CustomArrayWareHouse;
import com.viduk.ft.service.impl.*;
import com.viduk.ft.observer.CustomArrayObserver;

public class CustomArrayObserverImpl implements CustomArrayObserver {
	private static final Logger log = LogManager.getLogger();
	
	public void update(CustomArray array) {
		CustomArrayWareHouse warehouse = CustomArrayWareHouse.getInstance();
		CustomArraySearchServiceImpl searchService = new CustomArraySearchServiceImpl(); 
		OptionalInt minOptional = searchService.findMin(array);
		OptionalInt maxOptional = searchService.findMax(array);
		int sum = searchService.findSum(array);
		try {
			int min = minOptional.getAsInt();
			int max = maxOptional.getAsInt();
			warehouse.put(array.getId(), new CustomArrayStatistics(max, min, sum)); 
		}
		catch(Exception e) {
			log.log(Level.WARN, "can't calculate min and max for array" + array);
		}
	}
	
}
