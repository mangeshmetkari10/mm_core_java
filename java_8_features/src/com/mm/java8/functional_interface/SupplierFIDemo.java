package com.mm.java8.functional_interface;

import java.util.function.Supplier;

public class SupplierFIDemo {

	public static void main(String[] args) {

		Supplier<String> message = () -> "Hello Supplier!";
		System.out.println("Supplier Functional Interface :" + message.get());
		// Supplier Functional Interface :Hello Supplier!
		
		// Supplier that generates a random number
		Supplier<Double> randomValueSupplier = () -> Math.random();
		// Use the supplier to get a random number
		double randomNumber = randomValueSupplier.get();
		System.out.println("Random number: " + randomNumber);
		// Random number: 0.7157357701670709
	}
}
