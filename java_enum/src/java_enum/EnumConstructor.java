package java_enum;

public class EnumConstructor {

	public static void main(String[] args) {

		Color c1 = Color.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}

enum Color {

	RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET;

	// Enum constructor called separately for each
	// constant
	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}

	public void colorInfo() {
		System.out.println("Universal Color");
	}
}
