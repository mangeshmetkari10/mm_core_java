package com.mm.oops.overrding;

public class MethodOverrdingDemo {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.dispaly();

		Child c = new Child();
		c.dispaly();

		Parent p2 = new Child();
		p2.dispaly();

		Operation operation = new Addition();
		operation.add(12, 123);
	}
}
