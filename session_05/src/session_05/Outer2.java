package session_05;

public class Outer2 {
	
	private static int no = 111;
	
	public static class Inner2
	{
		static int y = 10;
		public void get()
		{
			System.out.println("no : "+no+" y = "+y);
		}
	}
	
	public static void main(String[] args) {
		
		Outer2.Inner2 i = new Outer2.Inner2();
		i.get();
		
	}

}
