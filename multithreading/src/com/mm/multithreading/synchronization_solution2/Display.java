package com.mm.multithreading.synchronization_solution2;

public class Display {

	public static synchronized void wish(String name) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException exception) {
				System.out.println(name);
			}
			System.out.println(name);
		}
	}
}
