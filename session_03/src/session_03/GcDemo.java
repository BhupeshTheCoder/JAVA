package session_03;

public class GcDemo {

	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Object is garbage Collected");
	}

	public static void main(String[] args) {
		
		GcDemo g1 = new GcDemo();
		GcDemo g2 = new GcDemo();
		GcDemo g3 = new GcDemo();
		
		//....
		//...
		//....
		
		g1 = null;
		g2 = null;
		g3 = null;
		
		System.gc();
	}
}
