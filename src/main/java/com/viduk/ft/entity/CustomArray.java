package com.viduk.ft.entity;

import java.util.Objects;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.viduk.ft.exсeption.*;

public class CustomArray {

	private static final Logger log = LogManager.getLogger(); 
	
	private long id;
	private int[] data;

	public CustomArray() {

	}

	public CustomArray(long id, int size) {
		this.setId(id);
		this.data = new int[size];
	}

	public CustomArray(long id, int[] data) {
		this.setId(id);
		this.data = data.clone();
	}

	public int get(int index) throws CustomArrayException {
		if (index >= data.length || index < 0) {
			throw new CustomArrayException("index is out range");
		}
		return data[index];
	}

	public void set(int index, int el) throws CustomArrayException {
		if (index >= data.length || index < 0) {
			throw new CustomArrayException("index is out range");
		}
		data[index] = el;
	}
	
	public int[] getData() {
		return data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int size() throws CustomArrayException {
		if (data == null) {
			return -1;
		}
		return data.length;
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
		return Objects.hash(this.id, this.data);
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