package com.mm.multithreading;

public class ThreadDefinationApproach2  implements Runnable{

	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
