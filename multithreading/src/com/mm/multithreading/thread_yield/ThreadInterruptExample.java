package com.mm.multithreading.thread_yield;

public class ThreadInterruptExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				System.out.println("I got interrupted");
			}
		}
	}
}
