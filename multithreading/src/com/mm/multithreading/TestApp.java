package com.mm.multithreading;

public class TestApp {

	public static void main(String[] args) {

		ThreadDefinationApproach1 threadOne = new ThreadDefinationApproach1();
		threadOne.start();
		ThreadDefinationApproach2 runnable = new ThreadDefinationApproach2();
		Thread threadTwo = new  Thread(runnable);
		threadTwo.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
