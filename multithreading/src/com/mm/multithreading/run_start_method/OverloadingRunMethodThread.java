package com.mm.multithreading.run_start_method;

public class OverloadingRunMethodThread extends Thread{

	@Override
	public void run() {
		System.out.println("0 args method");
	}
	
	public void run(int i){
		System.out.println("int arg method");
	}
}
