package com.mm.exception_handling.customized_exception;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		int age = 20;
		if(age>60)
			throw new TooOldException("Your age is crossed marriege age limit");
		else if(age<18)
			throw  new TooYoungException("Please wait for some year to get marrieed");
		else
			System.out.println("U  will get match detail on mail");

	}

}
