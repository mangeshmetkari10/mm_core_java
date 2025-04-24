package com.mm.inner_interface.static_nested;

public class StaticNestedDemo {

	int x = 10;
	static int y =20;
	
	public static void main(String[] args) {
		StaticNestedDemo demo = new StaticNestedDemo();
		System.out.println("Outer class main method");
		System.out.println("instance variable of outer class :"+demo.x);
		System.out.println("static variable of outer class :"+y);
		Nested.m1();
	}
	
	
	static class Nested{
		public static void m1() {
			StaticNestedDemo demo = new StaticNestedDemo();
			System.out.println("instance variable of outer class :"+demo.x);
			System.out.println("static variable of outer class :"+y);
		}
	}

}
