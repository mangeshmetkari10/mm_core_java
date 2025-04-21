package com.mm.multithreading.thread_group;

public class ThreadOne extends Thread {

	public ThreadOne(ThreadGroup group, String name) {
		super(group, name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

}
