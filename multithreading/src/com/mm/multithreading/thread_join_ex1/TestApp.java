package com.mm.multithreading.thread_join_ex1;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {

		ThreadJoinExample yieldExample = new ThreadJoinExample();
		Thread thread = new Thread(yieldExample);
		thread.start();
		thread.join();
		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());

		}
	}
}