package com.mm.generics.enum_example;

public enum Operation {

	ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION;

	public <T extends Number> double apply(T a, T b) {

		switch (this) {
		case ADDITION:
			return a.doubleValue() + b.doubleValue();
		case SUBTRACTION:
			return a.doubleValue() - b.doubleValue();
		case DIVISION:
			return a.doubleValue() / b.doubleValue();
		case MULTIPLICATION:
			return a.doubleValue() * b.doubleValue();
		default:
			throw new IllegalArgumentException("Unexpected value: " + this);
		}

	}
}
