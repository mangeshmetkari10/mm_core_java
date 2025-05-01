package com.mm.java8.functional_interface;

import java.util.function.Consumer;

public class ConsumerFIDemo {

	public static void main(String[] args) {

		Consumer<Integer> consumer1 = (value) -> System.out.println("Consumer : " + value);
		consumer1.accept(100);// Consumer : 100

		Consumer<String> consumer2 = (value) -> System.out.println("Consumer : " + value);
		consumer2.accept("Functional Interface");// Consumer : Functional Interface
	}
}