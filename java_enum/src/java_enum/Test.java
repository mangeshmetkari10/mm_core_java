package java_enum;

public class Test {

	public static void main(String[] args) {
		Days[] days = Days.values();

		for (Days day : days) {
			System.out.println(day);
			System.out.println(day.ordinal());
		}

		Days day;
		day = Days.SATURDAY;

		switch (day) {
		case MONDAY:
			System.out.println("You choose MONDAY !");
			break;
		case TUESDAY:
			System.out.println("You choose TUESDAY !");
			break;
		case WEDNESDAY:
			System.out.println("You choose WEDNESDAY !");
			break;
		case THURSDAY:
			System.out.println("You choose THURSDAY !");
			break;
		case FRIDAY:
			System.out.println("You choose FRIDAY !");
			break;
		case SATURDAY:
			System.out.println("You choose SATURDAY !");
			break;
		case SUNDAY:
			System.out.println("You choose SUNDAY !");

		}

	}
}