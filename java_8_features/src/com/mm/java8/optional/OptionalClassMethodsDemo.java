package com.mm.java8.optional;

import java.util.Optional;

public class OptionalClassMethodsDemo {

	public static void main(String[] args) {

		Optional<String> opt = Optional.of("Mangesh");
		System.out.println(opt.isPresent());// true
		System.out.println(opt.get());// Mangesh

		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());// false

		String name = "Mangesh";
		if (name != null) {
			System.out.println(name.length());// 7
		}
		Optional<String> optional = Optional.of("Ramesh");
		optional.ifPresent(str -> System.out.println(str.length()));// 6
		String nullName = null;

		name = Optional.ofNullable(nullName).orElse("Ramesh");
		System.out.println(name);// Ramesh

		name = Optional.ofNullable(nullName).orElseGet(() -> "Mangesh");
		System.out.println(name);// Mangesh

		name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);// java.lang.IllegalArgumentException
		System.out.println(name);
	}
}