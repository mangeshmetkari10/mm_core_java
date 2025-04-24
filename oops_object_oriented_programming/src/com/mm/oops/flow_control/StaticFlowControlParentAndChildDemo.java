package com.mm.oops.flow_control;

class StaticFlowControlParentAndChildDemo  extends Base{

	static int x = 100;
	static {
		m2();
		System.out.println("Child static block");
	}

	public static void main(String[] args) {

		m2();
		System.out.println("child main method");
	}

	public static void m2() {
		System.out.println(y);
	}

	static {
		System.out.println("child  static block 2");
	}
	static int y = 200;
}
