package com.mm.exception_handling.throws_statement;

public class FlowofMethodCallsWithThrows {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution stated of main() Method ");
		doStuff();
		System.out.println("Execution stated of main() Method ");
	}

	public static void doStuff() throws InterruptedException {
		System.out.println("Execution stated of doStuff() Method ");
		doMoreStuff();
		System.out.println("Execution completed of doStuff() Method ");

	}

	public static void doMoreStuff() throws InterruptedException {
		System.out.println("Execution stated of doMoreStuff() Method ");
		Thread.sleep(100);
		System.out.println("Execution stated of doMoreStuff() Method ");

	}
}
