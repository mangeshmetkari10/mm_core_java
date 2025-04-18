package collection.comparator;

import java.util.TreeSet;

public class ComparableDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		System.out.println("A".compareTo("Z"));// -25
		System.out.println("M".compareTo("L"));// 1
		System.err.println("S".compareTo("S"));// 0

		TreeSet treeSet = new TreeSet(new StringDescComprator());
		treeSet.add("M");
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("A");
		System.out.println(treeSet);// [A, B, M, Z]

		TreeSet treeSet1 = new TreeSet(new IntegerDescComprator());
		treeSet1.add(100);
		treeSet1.add(344);
		treeSet1.add(11);
		treeSet1.add(677);
		System.out.println(treeSet1);// [677, 344, 100, 11]

		TreeSet studentTreeSet = new TreeSet(new StudentIdDescComprator());
		studentTreeSet.add(new Student(101, "Mangesh"));
		studentTreeSet.add(new Student(410, "Sangram"));
		studentTreeSet.add(new Student(210, "Rahul"));
		studentTreeSet.add(new Student(310, "Amol"));
		System.out.println(studentTreeSet);
		// [Student [id=410, name=Sangram], Student [id=310, name=Amol],
		// Student [id=210, name=Rahul], Student [id=101, name=Mangesh]]

		TreeSet studentNameATreeSet = new TreeSet(new StudentNameAsceComprator());
		studentNameATreeSet.add(new Student(101, "Mangesh"));
		studentNameATreeSet.add(new Student(410, "Sangram"));
		studentNameATreeSet.add(new Student(210, "Rahul"));
		studentNameATreeSet.add(new Student(310, "Amol"));
		System.out.println(studentNameATreeSet);
		// [Student [id=310, name=Amol], Student [id=101, name=Mangesh],
		// Student [id=210, name=Rahul], Student [id=410, name=Sangram]]

		TreeSet studentNameDTreeSet = new TreeSet(new StudentNameDescComprator());
		studentNameDTreeSet.add(new Student(101, "Mangesh"));
		studentNameDTreeSet.add(new Student(410, "Sangram"));
		studentNameDTreeSet.add(new Student(210, "Rahul"));
		studentNameDTreeSet.add(new Student(310, "Amol"));
		System.out.println(studentNameDTreeSet);
		// [Student [id=410, name=Sangram], Student [id=210, name=Rahul],
		// Student [id=101, name=Mangesh], Student [id=310, name=Amol]]

	}
}
