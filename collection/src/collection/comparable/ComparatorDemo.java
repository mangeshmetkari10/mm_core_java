package collection.comparable;

import java.util.TreeSet;

public class ComparatorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		System.out.println("A".compareTo("Z"));// -25
		System.out.println("M".compareTo("L"));// 1
		System.err.println("S".compareTo("S"));// 0

		TreeSet stringTreeSet = new TreeSet();
		stringTreeSet.add("M");
		stringTreeSet.add("B");
		stringTreeSet.add("Z");
		stringTreeSet.add("A");
		System.out.println(stringTreeSet);// [A, B, M, Z]

		TreeSet integerTreeSet = new TreeSet();
		integerTreeSet.add(10);
		integerTreeSet.add(30);
		integerTreeSet.add(54);
		integerTreeSet.add(3);
		System.out.println(integerTreeSet);// [3, 10, 30, 54]

		TreeSet studentTreeSet = new TreeSet();
		studentTreeSet.add(new Student(101, "Mangesh"));
		studentTreeSet.add(new Student(410, "Sangram"));
		studentTreeSet.add(new Student(210, "Rahul"));
		studentTreeSet.add(new Student(310, "Amol"));
		System.out.println(studentTreeSet);
		// [Student [id=101, name=Mangesh], Student [id=210, name=Rahul],
		// Student [id=310, name=Amol], Student [id=410, name=Sangram]]
	}
}