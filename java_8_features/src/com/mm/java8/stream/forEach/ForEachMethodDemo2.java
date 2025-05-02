package com.mm.java8.stream.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Consumer<? super Integer> square = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("square of " + t + " is :" + t * t);

			}

		};

		numbers.stream().forEach(square);

		numbers.stream().forEach(num -> System.out.println("cube of " + num + " is : " + num * num * num));

	}
}
