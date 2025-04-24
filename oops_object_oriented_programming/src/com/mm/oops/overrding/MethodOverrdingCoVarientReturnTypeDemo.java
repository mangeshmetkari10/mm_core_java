package com.mm.oops.overrding;

public class MethodOverrdingCoVarientReturnTypeDemo {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		Object wish1 = p1.wish("Sangram");
		System.out.println(wish1);

		Child c = new Child();
		String wish2 = c.wish("Sopan");
		System.out.println(wish2);

		Parent p2 = new Child();
		Object wish3 = p2.wish("Mangesh");
		System.out.println(wish3);
	}
}
