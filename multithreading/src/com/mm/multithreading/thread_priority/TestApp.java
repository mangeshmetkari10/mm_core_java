package com.mm.multithreading.thread_priority;

public class TestApp {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "   " + Thread.currentThread().getPriority());

		ThreadPriorityExample priorityExample = new ThreadPriorityExample();
		Thread thread = new Thread(priorityExample);
		System.out.println(thread.getName() + "  " + thread.getPriority());
		Thread.currentThread().setPriority(9);
		thread.setPriority(8);
		System.out.println(Thread.currentThread().getName() + "   " + Thread.currentThread().getPriority());
		System.out.println(thread.getName() + "  " + thread.getPriority());
		thread.start();

	}

}
