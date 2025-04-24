package com.mm.oops.flow_control;

public class InstanceFlowControlDemo {

	int i = 10;
	{
		m1();
		System.out.println("1st static block");
	}

	public InstanceFlowControlDemo() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {

		InstanceFlowControlDemo demo = new InstanceFlowControlDemo();
		demo.m1();
		System.out.println("main method");
	}

	public void m1() {
		System.out.println(j);
	}

	{
		System.out.println("2nd static block");
	}
	int j = 20;
}
