package com.mm.interface_inner_classes;

public class InnerClassInInterfaceDemo {

	public static void main(String[] args) {
		SubClassOuter classOuter = new SubClassOuter();
		classOuter.m1();

	}

}

class SubClassOuter implements InnerClassInInterface {
	public void m1() {
		SubClass subClass = new SubClass();
		subClass.m2();
	}

}
