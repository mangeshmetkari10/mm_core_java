package collection.map;

import java.util.Hashtable;

public class HashtableDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Hashtable hashtable = new Hashtable();
	
		hashtable.put(new Data(5),"A");
		hashtable.put(new Data(3),"Z");
		hashtable.put(new Data(2),"C");
		hashtable.put(new Data(43),"M");
		hashtable.put(new Data(11),"P");
		//hashtable.put(new Data(21),null); //java.lang.NullPointerException
		System.out.println(hashtable);//{ i = 43=M,  i = 5=A,  i = 3=Z,  i = 2=C,  i = 11=P}
		
	}

}
