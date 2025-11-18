package com.viduk.ft.warehouse;

import java.util.Map;
import java.util.HashMap;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.stats.CustomArrayStats;

public class CustomArrayWareHouse {

	private static final Logger log = LogManager.getLogger();
	private final Map<Long, CustomArrayStats> stats = new HashMap<Long, CustomArrayStats>();
	private static final CustomArrayWareHouse instance = new CustomArrayWareHouse();
	
	private CustomArrayWareHouse() {}
	
	public static CustomArrayWareHouse getInstance() {
		return instance;
	}
	
	public void put(Long id, CustomArrayStats parameters) {
		if(parameters == null) {
			log.log(Level.WARN, "Pretend to put null stats in WareHouse");
		}
		stats.put(id, parameters);
	}
	
	public CustomArrayStats get(long id) {
		return stats.get(id);
	}
	
	public void remove(long id) {
		stats.remove(id);
	}
	
}
