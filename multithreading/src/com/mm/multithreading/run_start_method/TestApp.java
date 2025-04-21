package com.mm.multithreading.run_start_method;

public class TestApp {

	public static void main(String[] args) {
		//current thread
		System.out.println(Thread.currentThread().getName());
		
		//not providing run method implementation
		NotOverridingRunMethodThread thread = new NotOverridingRunMethodThread();
		thread.start();
		
		//overloading of run() method
		OverloadingRunMethodThread thread2 = new OverloadingRunMethodThread();
		thread2.start();
		
		//overriding of start method
		OverridingStartMethodThread thread3  =new OverridingStartMethodThread();
		thread3.start();
		
		
		////overriding of start method and call super.start()
		OverridingStartMethodAndCallSuperRunMethodThread thread4 = new OverridingStartMethodAndCallSuperRunMethodThread();
		thread4.start();
		
		

	}

}
