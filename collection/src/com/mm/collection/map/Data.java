package com.mm.collection.map;

public class Data {

	private int i;

	public Data() {
		super();
	}

	public Data(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return " i = " + i;
	}

}
