package com.mm.java8.lambda_expression;

public class LambdaExpressionExample4 {

	public static void main(String[] args) {

		Runnable runnable1 = new MyThread();
		Thread thread1 = new Thread(runnable1);
		thread1.start();// Thread-0 from MyThead class

		Runnable runnable2 = () -> {
			System.out.println(Thread.currentThread().getName() + ": lambda expression");
		};
		Thread thread2 = new Thread(runnable2);
		thread2.start();// Thread-1 form lambda expression
	}
}

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": MyThead class");
	}
}
