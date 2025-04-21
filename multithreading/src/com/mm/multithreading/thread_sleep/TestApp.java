package com.mm.multithreading.thread_sleep;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
	}
}