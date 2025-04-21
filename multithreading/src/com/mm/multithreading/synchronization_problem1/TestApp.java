package com.mm.multithreading.synchronization_problem1;

public class TestApp {

	public static void main(String[] args) {

		Display display = new Display();
		MyThread myThread1 = new MyThread(display, "Mangesh");
		MyThread myThread2 = new MyThread(display, "Sangram");
		myThread1.start();
		myThread2.start();
		
	}
}