package com.mm.multithreading.thread_name;

public class TestApp {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadNameExample threadNameExample = new ThreadNameExample();
		Thread thread = new Thread(threadNameExample);
		System.out.println(thread.getName());
		thread.setName("Mangesh Thread");
		Thread.currentThread().setName("Main Thread");
		System.out.println(Thread.currentThread().getName());
		thread.start();

	}

}
