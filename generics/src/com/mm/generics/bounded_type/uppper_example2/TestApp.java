package com.mm.generics.bounded_type.uppper_example2;

public class TestApp {
	public static void main(String[] args) {

		MyNumber myNumber = new MyNumber(10);

		Box<MyNumber> box = new Box<>(myNumber);
		box.dispaly();

	}
}
