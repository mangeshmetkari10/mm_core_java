package com.mm.member_inner_class;

public class MemberInnerClassDemo {

	static int staticOuterMember = 10;

	int instacneOuterMember = 20;

	class InnerClass {
		static int staticInnerMember = 100;

		int instacneInnerMember = 200;

		// Inner class static method
		public static void innerStaticMethod() {
			System.out.println("Inner class innerStaticMethod() method");
			System.out.println("staticOuterMember :" + staticOuterMember);
			System.out.println("staticInnerMember :" + staticInnerMember);

			MemberInnerClassDemo outerClass = new MemberInnerClassDemo();
			InnerClass innerClass = outerClass.new InnerClass();

			System.out.println("instacneOuterMember :" + outerClass.instacneOuterMember);
			System.out.println("instacneInnerMember :" + innerClass.instacneInnerMember);

		}

		// Inner class instance method
		public void innerInstanceMethod() {
			System.out.println("Inner Class instacne innerInstanceMethod() method");
			System.out.println("staticOuterMember :" + staticOuterMember);
			System.out.println("staticInnerMember :" + staticInnerMember);

			System.out.println("instacneOuterMember :" + instacneOuterMember);
			System.out.println("instacneInnerMember :" + instacneInnerMember);
		}
	}

	// Outer class static method
	public static void main(String[] args) {

		System.out.println("Outer Class static main() method");
		MemberInnerClassDemo outerClass = new MemberInnerClassDemo();
		InnerClass innerClass = outerClass.new InnerClass();

		System.out.println("staticOuterMember :" + staticOuterMember);
		System.out.println("staticInnerMember :" + InnerClass.staticInnerMember);
		System.out.println("instacneOuterMember :" + outerClass.instacneOuterMember);
		System.out.println("instacneInnerMember :" + innerClass.instacneInnerMember);

		innerClass.innerInstanceMethod();
		InnerClass.innerStaticMethod();
		outerClass.outerInstanceMethod();

	}

	// Outer class instance method
	public void outerInstanceMethod() {
		InnerClass innerClass = new InnerClass();
		System.out.println("Outer class outerInstanceMethod()");

		System.out.println("staticOuterMember :" + staticOuterMember);
		System.out.println("staticInnerMember :" + InnerClass.staticInnerMember);
		
		System.out.println("instacneOuterMember :" + instacneOuterMember);
		System.out.println("instacneInnerMember :" + innerClass.instacneInnerMember);

		innerClass.innerInstanceMethod();
		InnerClass.innerStaticMethod();

	}
}
