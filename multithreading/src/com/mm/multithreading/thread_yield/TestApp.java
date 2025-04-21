package com.mm.multithreading.thread_yield;

public class TestApp {

	public static void main(String[] args) {

		ThreadInterruptExample interruptExample = new ThreadInterruptExample();
		Thread thread = new Thread(interruptExample);
		thread.start();
		thread.interrupt();
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());

		}
	}
}