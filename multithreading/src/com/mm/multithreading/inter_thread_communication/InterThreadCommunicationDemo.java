package com.mm.multithreading.inter_thread_communication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {

		ThreadOne one = new ThreadOne();
		one.start();
		synchronized (one) {
			System.out.println("main thread calling wait() method");
			one.wait();
			System.out.println("main thread got notification call");
			System.out.println(one.total);
		}

	}

}
