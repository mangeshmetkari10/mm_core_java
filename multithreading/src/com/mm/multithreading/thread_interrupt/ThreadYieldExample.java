package com.mm.multithreading.thread_interrupt;

public class ThreadYieldExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}
