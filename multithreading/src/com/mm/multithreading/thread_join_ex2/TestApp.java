package com.mm.multithreading.thread_join_ex2;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {

		ThreadJoinExample thread = new ThreadJoinExample();
		ThreadJoinExample.mainThread = Thread.currentThread();
		thread.start();

		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());

		}
	}
}