package com.mm.java_lang_package.string_class;

public class ImmutableClass {

	private int i;

	public ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass modifiy(int i) {

		if (this.i == i)
			return this;
		else
			return new ImmutableClass(i);
	}

	public static void main(String[] args) {
		ImmutableClass t1 = new ImmutableClass(1);
		ImmutableClass t2 = t1.modifiy(12);
		ImmutableClass t3 = t1.modifiy(43);

		System.out.println(t1 == t2);//false
		System.out.println(t1 == t3);//false
	}
}
