package com.mm.multithreading.thread_join_ex1;

public class ThreadJoinExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}
