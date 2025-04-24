package com.mm.anonymous_inner_classes;

public class AnomymousInnerClassByImplementingInterface{


	public static void main(String[] args) {
		Transaction transaction1 = new Transaction() {
			
			@Override
			public void withDraw(int amount) {
				System.out.println("ATM withdraw amount :"+amount);
				
			}
		};
		
		transaction1.withDraw(1000);
	}
}

interface Transaction {
	public void withDraw(int amount) ;
}

