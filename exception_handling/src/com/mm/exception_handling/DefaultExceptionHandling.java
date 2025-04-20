package com.mm.exception_handling;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Execution stated of main() Method ");
		doStuff();
		System.out.println("Execution stated of main() Method ");
	}

	public static void doStuff() {
		System.out.println("Execution stated of doStuff() Method ");
		doMoreStuff();
		System.out.println("Execution completed of doStuff() Method ");

	}

	public static void doMoreStuff() {
		System.out.println("Execution stated of doMoreStuff() Method ");
		System.out.println(14/0);
		System.out.println("Execution stated of doMoreStuff() Method ");

	}
}
