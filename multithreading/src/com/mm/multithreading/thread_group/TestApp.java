package com.mm.multithreading.thread_group;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup parentGroup = new ThreadGroup("parent_thread_group");
		ThreadGroup childGroup = new ThreadGroup(parentGroup,"child_thread_group");

		
		ThreadOne threadOne1 = new ThreadOne(parentGroup, "childThread_1");
		ThreadOne threadOne2 = new ThreadOne(childGroup, "childThread_2");

		threadOne1.start();
		threadOne2.start();
		System.out.println(parentGroup.activeCount());
		System.out.println(parentGroup.activeGroupCount());
		parentGroup.list();
		Thread.sleep(2000);
		System.out.println(parentGroup.activeCount());
		System.out.println(parentGroup.activeGroupCount());
		parentGroup.list();

	}

}
