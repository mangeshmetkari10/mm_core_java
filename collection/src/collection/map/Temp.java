package collection.map;

public class Temp {

	@Override
	public String toString() {
		return "temp";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" finalize() called");
	}
}
