package java_enum;

enum Day {
	MONDAY() {
		@Override
		public String getNumberOfDay() {
			return "1st day of a weak";
		}
	},
	TUESDAY() {
		@Override
		public String getNumberOfDay() {
			return "2nd day of a weak";
		}
	},
	WEDNESDAY() {
		@Override
		public String getNumberOfDay() {
			return "3rd day of a weak";
		}
	},
	THURSDAY() {
		@Override
		public String getNumberOfDay() {
			return "4th day of a weak";
		}
	},
	FRIDAY() {
		@Override
		public String getNumberOfDay() {
			return "5th day of a weak";
		}
	},
	SATURDAY() {
		@Override
		public String getNumberOfDay() {
			return "6th day of a weak";
		}
	},
	SUNDAY() {
		@Override
		public String getNumberOfDay() {
			return "7th day of a weak";
		}
	};

	public abstract String getNumberOfDay();
}

public class EnumTest {
	public Day day;

	public EnumTest(Day day) {
		this.day = day;
	};

	public static void main(String[] args) {
		EnumTest daynum = new EnumTest(Day.MONDAY);
		System.out.println("The " + daynum.day.name() + " is " + daynum.day.getNumberOfDay());

		daynum = new EnumTest(Day.SATURDAY);
		System.out.println("The " + daynum.day.name() + " is " + daynum.day.getNumberOfDay());

	}
}
