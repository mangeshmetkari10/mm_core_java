package com.mm.method_local_inner_class;

public class MethodLocalInnerClass {

	static int staticOuterMember = 10;
	int instacneOuterMember = 20;

	// Outer class static/main method
	public static void main(String[] args) {

		System.out.println("Outer Class static main() method");
		MethodLocalInnerClass outerClass = new MethodLocalInnerClass();

		System.out.println("staticOuterMember :" + staticOuterMember);
		System.out.println("instacneOuterMember :" + outerClass.instacneOuterMember);

		outerClass.outerMethod();
	}

	// Outer class instance method
	public void outerMethod() {

		class LocalInnerClass {
			static int staticInnerMember = 100;
			int instacneInnnerMember = 200;

			// Inner class instance method
			void innerMethod() {
				System.out.println("Inner Class  innerMethod() method");
				System.out.println("staticOuterMember :" + staticOuterMember);
				System.out.println("instacneOuterMember :" + instacneOuterMember);
				System.out.println("staticInnerMember :" + staticInnerMember);
				System.out.println("instacneInnnerMember :" + instacneInnnerMember);
			}
		}
		LocalInnerClass innerClass = new LocalInnerClass();
		innerClass.innerMethod();
	}
}
