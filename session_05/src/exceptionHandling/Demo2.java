package exceptionHandling;
public class Demo2 {
	public static void main(String[] args) {
		try
		{
		int a,b,c=0;
		a = Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c = a/b;
		System.out.println("Division = "+c);
		}catch (Exception e) {
			if(e instanceof ArithmeticException)
			{
				System.out.println("Denominator should not be zero");
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println("Enter only integer");
			}else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Please enter atleast two numbers");
			}
			else
			{
				System.out.println("EXCEPTION!!!!");
				
			}
		}	
	}
}
