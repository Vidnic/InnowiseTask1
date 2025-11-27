package com.viduk.ft.warehouse;

import java.util.Map;
import java.util.HashMap;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.entity.CustomArrayStatistics;

public class CustomArrayWareHouse {

	private static final Logger log = LogManager.getLogger();
	private static final CustomArrayWareHouse instance = new CustomArrayWareHouse();
	private final Map<Long, CustomArrayStatistics> statistics = new HashMap<Long, CustomArrayStatistics>();
	
	private CustomArrayWareHouse() {}
	
	public static CustomArrayWareHouse getInstance() {
		return instance;
	}
	public void put(long id, CustomArrayStatistics parameters) {
		if(parameters == null) {
			log.log(Level.WARN, "Pretend to put null stats in WareHouse");
		}
		statistics.put(id, parameters);
	}
	public CustomArrayStatistics get(long id) {
		return statistics.get(id);
	}
	public void remove(long id) {
		statistics.remove(id);
	}
}