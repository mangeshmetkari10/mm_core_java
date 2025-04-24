package com.mm.inner_interface.interface_within_interface;

public class InterInterfaceInInterfaceDemo {

	public static void main(String[] args) {

		OuterImplClass outerImplClass = new OuterImplClass();
		outerImplClass.m1();
	}
}

class OuterImplClass implements OuterInterface {

	public void m1() {
		System.out.println("this is from OuterImplClass ");
		InnerImplClass innerImplClass = new InnerImplClass();
		innerImplClass.m2();
	}

	class InnerImplClass implements InnerInterFace {

		@Override
		public void m2() {
			System.out.println("this is from InnerImplClass ");
		}

	}

}