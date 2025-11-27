package com.viduk.ft.entity;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.OptionalInt;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.exсeption.CustomArrayException;
import com.viduk.ft.observer.*;

public class CustomArray implements CustomArrayObservable {

	private static final Logger log = LogManager.getLogger();
	private long id;
	private int[] data;
	private CustomArrayObserver observer;

	public CustomArray() {

	}
	public CustomArray(long id, int size) {
		this.setId(id);
		this.data = new int[size];
	}
	public CustomArray(long id, int[] data) {
		this.setId(id);
		if (data == null) {
			log.log(Level.WARN, "Create CustomArray with null data");
		}
		this.data = data.clone();
	}
	public int get(int index) throws CustomArrayException {
		if (index >= data.length || index < 0) {
			log.log(Level.ERROR, "index is out range" + index);
			throw new CustomArrayException("index is out range" + index);
		}
		return data[index];
	}
	public void set(int index, int element) throws CustomArrayException {
		if (index >= data.length || index < 0) {
			log.log(Level.ERROR, "index is out range" + index);
			throw new CustomArrayException("index is out range");
		}
		data[index] = element;
		if (observer != null) {
      observer.update(this);
		}
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		if (data == null) {
			log.log(Level.WARN, "Create CustomArray with null data");
		}
		this.data = data.clone();
		if (observer != null) {
      observer.update(this);
		}
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public OptionalInt size() {
		if (data == null) {
			return OptionalInt.empty();
		}
		return OptionalInt.of(data.length);
	}
	public IntStream stream() {
		return Arrays.stream(data);
	}
	@Override
	public void addObserver(CustomArrayObserver observer) throws CustomArrayException {
		if (observer == null) {
			throw new CustomArrayException("observer can't be null");
		}
		this.observer = observer;

	}
	@Override
	public void removeObserver() {
		this.observer = null;
	}
	@Override
	public void notifyObservers() {
		if (observer != null) {
			observer.update(this);
		}
	}
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || this.getClass() != object.getClass())
			return false;
		CustomArray array = (CustomArray) object;
		return this.id == array.id && Arrays.equals(this.data, array.data);
	}
	@Override
	public int hashCode() {
		int total = 31;
		total = total * 31 + Long.hashCode(this.id);
		total = total * 31 + (this.data == null ? 0 : Arrays.hashCode(this.data));
		return total;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomArray [id=");
		builder.append(id);
		builder.append(", data=");
		builder.append(Arrays.toString(data));
		builder.append("]");
		return builder.toString();
	}
	public static Builder newBuilder() {
		return new CustomArray().new Builder();
	}
	
	public class Builder {

		private Builder() {

		}
		public Builder setId(long id) {
			CustomArray.this.id = id;
			return this;
		}
		public Builder setData(int[] data) {
			CustomArray.this.data = data.clone();
			return this;
		}
		public CustomArray build() {
			return CustomArray.this;
		}
	}
}