package com.mm.generics.bounded_type.uppper_example2;

public class MyNumber extends Number implements Printable {

	private static final long serialVersionUID = 1L;
	
	private int value = 0;

	public MyNumber(int value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("MyNumber : " + value);
	}

	@Override
	public int intValue() {
		return value;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

}
