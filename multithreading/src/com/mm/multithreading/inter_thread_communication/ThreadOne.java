package com.mm.multithreading.inter_thread_communication;

public class ThreadOne extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calculations");
			for (int i = 1; i <= 5; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}
