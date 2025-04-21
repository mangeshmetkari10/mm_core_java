package com.mm.multithreading.thread_interrupt;

public class TestApp {

	public static void main(String[] args) {

		ThreadYieldExample yieldExample = new ThreadYieldExample();
		Thread thread = new Thread(yieldExample);
		thread.start();
		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());

		}
	}
}