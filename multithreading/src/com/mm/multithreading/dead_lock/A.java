package com.mm.multithreading.dead_lock;

public class A {
	public synchronized void foo(B b) {
		System.out.println("Thread 1 starts execution of  foo() method");
		try {
			Thread.sleep(2000);
			
		}catch (InterruptedException e) {}
			System.out.println("Thread 1 trying to call b.last()");
			b.last();	
	}
	
	public synchronized void last() {
		System.out.println(" insded A this is last() method");
	}

}
