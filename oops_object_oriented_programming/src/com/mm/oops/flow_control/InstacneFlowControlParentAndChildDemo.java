package com.mm.oops.flow_control;

class InstacneFlowControlParentAndChildDemo  extends Parent{

	 int x = 100;
	 {
		m2();
		System.out.println("Child  block");
	}

	public static void main(String[] args) {

		InstacneFlowControlParentAndChildDemo c = new InstacneFlowControlParentAndChildDemo();
		c.m2();
		System.out.println("child main method");
	}

	public void m2() {
		System.out.println(y);
	}

	 {
		System.out.println("child  block 2");
	}
	 int y = 200;
}
