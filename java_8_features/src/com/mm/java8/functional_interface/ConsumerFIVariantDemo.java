package com.mm.java8.functional_interface;

import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerFIVariantDemo {

	public static void main(String[] args) {

		DoubleConsumer doubleConsumer = (value) -> System.out
			.println("DoubleConsumer :  square of " + value + " is : " + (value * value));
		doubleConsumer.accept(12.22);// DoubleConsumer : square of 12.22 is : 149.32840000000002

		IntConsumer intConsumer = (value) -> System.out
			.println("IntConsumer : square of " + value + " is : " + (value * value));
		intConsumer.accept(14);// IntConsumer : square of 14 is : 196

		LongConsumer longConsumer = (value) -> System.out
			.println("LongConsumer : square of " + value + " is : " + (value * value));
		longConsumer.accept(14101405);// LongConsumer : square of 14101405 is : 198849622974025

		BiConsumer<Integer, Integer> biConsumer = (age, percentage) -> {

			if (age > 14 && percentage > 75)
				System.out.println("BiConsumer : You are eligible for college election ");
			else
				System.out.println("BiConsumer : You are not eligible for college election ");
		};
		biConsumer.accept(15, 98);// BiConsumer : You are eligible for college election
	}
}