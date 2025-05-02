package com.mm.java8.method_reference;

public class InstanceMethodReferenceDemo {

	public static void main(String[] args) {
		Addition addition1 = new AdditionImpl();
		addition1.add(12, 12);// Traditional Approach square : 24

		Addition addition2 = (a, b) -> System.out.println("Lambda Expression sum : " + (a + b));
		addition2.add(12, 12);// Lambda Expression sum : 24

		InstanceMethodReferenceDemo demo = new InstanceMethodReferenceDemo();
		Addition addition3 = demo::sum;
		addition3.add(12, 12);// Method Reference sum : 24
	}
	public void sum(int a, int b) {
		System.out.println("Method Reference sum : " + (a + b));
	}
}

interface Addition {
	public void add(int a, int b);
}

class AdditionImpl implements Addition {

	@Override
	public void add(int a, int b) {
		System.out.println("Traditional Apporch  square  : " + (a + b));
	}
}
