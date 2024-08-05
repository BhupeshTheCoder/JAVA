package exceptionHandling;

public class Demo {
	
	public static void msg()
	{
		int no = 10/0;//ArithmeticException
		System.out.println("no = "+no);
	}
	
	public static void getMessage()
	{
		msg();
	}
	
	public static void main(String[] args) {
		
		getMessage();
		
	}
}

//o/p: Name of Exception : Description
//	Location of exception: Stack Frame
