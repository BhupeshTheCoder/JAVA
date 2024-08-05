package session_05;

public class Outer {
	
	private int no = 10;
	
	public class Inner
	{
		int no = 111;
		
		public void getNo()
		{
			int no = 1000;
			System.out.println("No = "+no);
		}
	}
	
	public void set()
	{
		Inner i = new Inner();
		i.getNo();
	}
	
	public static void main(String[] args) {	
		/*
		 * Outer o = new Outer(); 
		 * Inner i = o.new Inner();
		 */
		/*
		 * Inner i = new Outer().new Inner(); 
		 * i.getNo();
		 */
		
		Outer o = new Outer();
		o.set();	
	}
}
