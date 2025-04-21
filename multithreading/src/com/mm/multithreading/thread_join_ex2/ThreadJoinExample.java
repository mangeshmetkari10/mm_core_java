package com.mm.multithreading.thread_join_ex2;

public class ThreadJoinExample extends Thread {

	static Thread mainThread;
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			try {
				mainThread.join();
			} catch (InterruptedException e) {

			}
		}
	}
}
