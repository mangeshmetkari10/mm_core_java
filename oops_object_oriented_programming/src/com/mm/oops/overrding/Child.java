package com.mm.oops.overrding;

public class Child extends Parent {

	@Override
	public void dispaly() {
		System.out.println("In Child class");
	}

	@Override
	public String wish(String name) {
		return "Good Moring " + name;
	}

}
