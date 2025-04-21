package com.mm.multithreading.dead_lock;

public class B {

	public synchronized void bar(A a) {
		System.out.println("Thread 2 starts execution of bar() method");
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 trying to call a.last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B this is last() method");
	}
}
