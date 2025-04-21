package com.mm.multithreading.dead_lock;

public class DeadLockTestApp {

		
		A a = new A();
		B b = new B();
		
		public void m1() {
			Thread thread = new Thread();
			thread.start();
			a.foo(b);
			
		}

	public void run() {
		b.bar(a);//child thread
	}
	
	public static void main(String[] args) {
		DeadLockTestApp lockTestApp = new DeadLockTestApp();//main thread
		lockTestApp.m1();
	}

}
