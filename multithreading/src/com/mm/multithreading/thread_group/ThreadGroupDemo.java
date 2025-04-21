package com.mm.multithreading.thread_group;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup group= new ThreadGroup("my_thread_group_");
		Thread thread1 = new Thread(group, "Thread-1");
		Thread thread2 = new Thread(group, "Thread-2");
		group.setMaxPriority(3);
		
		Thread thread3 = new Thread(group, "Thread-3");
		
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		
		System.out.println(thread2.getName());
		System.out.println(thread2.getPriority());
		
		System.out.println(thread3.getName());
		System.out.println(thread3.getPriority());
	}

}
