package com.mm.java8.functional_interface;

import java.util.HashMap;
import java.util.function.Function;

public class FunctionFIDemo {

	private static HashMap<Integer, String> employee = new HashMap<>();

	public static void main(String[] args) {
		employee.put(1045, "Mangesh");
		employee.put(1242, "Deepak");

		Function<Integer, String> get = (Integer ID) -> {
			if (employee.containsKey(ID))
				return employee.get(ID);
			else
				return "Invalid ID";
		};

		System.out.println("ID = 1242, Name = " + get.apply(1242)); // ID = 1242, Name = Deepak
	}
}