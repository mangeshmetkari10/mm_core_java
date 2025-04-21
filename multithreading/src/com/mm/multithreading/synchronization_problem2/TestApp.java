package com.mm.multithreading.synchronization_problem2;

public class TestApp {

	public static void main(String[] args) {

		Display display1 = new Display();
		Display display2 = new Display();
		MyThread myThread1 = new MyThread(display1, "Mangesh");
		MyThread myThread2 = new MyThread(display2, "Sangram");
		myThread1.start();
		myThread2.start();
		
		
	}
}