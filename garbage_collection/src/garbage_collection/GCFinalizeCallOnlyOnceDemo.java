package garbage_collection;

public class GCFinalizeCallOnlyOnceDemo {

	public static void main(String[] args) throws InterruptedException {
		GCFinalizeCallOnlyOnceDemo demo = new GCFinalizeCallOnlyOnceDemo();
		System.out.println(demo.hashCode());
		demo = null;
		System.gc();
		Thread.sleep(2000);
		String s = "Mangesh";
		System.out.println(s);
		s = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("End of main");

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize() method call");
		super.finalize();
	}

}
