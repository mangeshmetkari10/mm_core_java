package collection.comparator;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class IntegerDescComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer number1 = (Integer) o1;
		Integer number2 = (Integer) o2;

		if (number1 > number2)
			return -1;
		else if (number1 < number2)
			return 1;
		else
			return 0;
	}

}
