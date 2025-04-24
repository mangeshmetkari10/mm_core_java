package garbage_collection;

public class GCFinalizeCallExcaptionRaisedDemo {

	public static void main(String[] args) throws Throwable {
		GCFinalizeCallExcaptionRaisedDemo demo = new GCFinalizeCallExcaptionRaisedDemo();
		//demo.finalize();
		demo = null;
		System.gc();
		System.out.println("End of main");

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize() method call");
		System.out.println(10/0);
	}

}
