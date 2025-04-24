package com.mm.inner_interface.interface_within_class;

public class InterInteWithinClassDemo {

	public static void main(String[] args) {

		SubClassChild subClassChild = new SubClassChild();
		subClassChild.m2();
	}
}

class SubClassChild  extends SubClass {

	
	
	public void m2() {
		System.out.println("this is from SubClassChild ");
		SubClassImpl innerImplClass = new SubClassImpl();
		innerImplClass.m1();
	}

	class SubClassImpl implements InnerInterFace  {

		@Override
		public void m1() {
			System.out.println("this is from SubClassImpl ");
		}

	}

}