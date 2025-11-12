package com.viduk.ft.entity;

import java.util.Objects;
import java.util.Arrays;
import com.viduk.ft.exeption.*;

public class ArrayManager {

	private long id;
	private int[] data;

	public ArrayManager() {

	}

	public ArrayManager(long id, int size) {
		this.setId(id);
		this.data = new int[size];
	}

	public ArrayManager(long id, int[] data) {
		this.setId(id);
		this.data = data.clone();
	}

	public int get(int index) throws CustomArrayException {
		if (index >= data.length || index < 0)
			throw new CustomArrayException("index is out range");
		return data[index];
	}

	public void set(int index, int el) throws CustomArrayException {
		if (index >= data.length || index < 0)
			throw new CustomArrayException("index is out range");
		data[index] = el;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || this.getClass() != object.getClass())
			return false;
		ArrayManager array = (ArrayManager) object;
		return this.id == array.id && Arrays.equals(this.data, array.data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.data);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayManager [id=");
		builder.append(id);
		builder.append(", data=");
		builder.append(Arrays.toString(data));
		builder.append("]");
		return builder.toString();
	}

	public static Builder newBuilder() {
		return new ArrayManager().new Builder();
	}

	public class Builder {

		private Builder() {

		}

		public Builder setId(long id) {
			ArrayManager.this.id = id;
			return this;
		}
		
		public Builder setData(int[] data) {
			ArrayManager.this.data = data.clone();
			return this;
		}

		public ArrayManager build() {
			return ArrayManager.this;
		}

	}

}