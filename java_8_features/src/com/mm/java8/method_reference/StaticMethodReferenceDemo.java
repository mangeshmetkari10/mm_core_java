package com.mm.java8.method_reference;

public class StaticMethodReferenceDemo {

	public static void main(String[] args) {
		Runnable runnable1 = new TradisionalThread();
		Thread thread1 = new Thread(runnable1);
		thread1.start();// Traditional : Thread-0

		Runnable runnable2 = () -> System.out.println("Lambda Expression : " + Thread.currentThread().getName());
		Thread thread2 = new Thread(runnable2);
		thread2.start();// Lambda Expression : Thread-1

		Runnable runnable3 = StaticMethodReferenceDemo::m1;
		Thread thread3 = new Thread(runnable3);
		thread3.start();// Method Reference : Thread-2
	}

	public static void m1() {
		System.out.println("Method Reference : " + Thread.currentThread().getName());
	}
}

class TradisionalThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Traditional  Apporch : " + Thread.currentThread().getName());
	}
}