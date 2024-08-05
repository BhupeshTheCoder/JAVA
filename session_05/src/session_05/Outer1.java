package session_05;
public class Outer1 {	
	private int no = 10;
	
	public void get()
	{
		 class Inner1
		{
			int y = 11;
			
			public void getData()
			{
				System.out.println("no = "+no+" y = "+y);
			}
		}
		 
		 Inner1 i = new Inner1();
		 i.getData();
	}
	
	public static void main(String[] args) {
		
		Outer1 o = new Outer1();
		o.get();	
	}
}
