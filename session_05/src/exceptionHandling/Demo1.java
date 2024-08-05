package exceptionHandling;
public class Demo1 {
	public static void main(String[] args) {
		try
		{
		int a,b,c=0;
		a = Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c = a/b;
		System.out.println("Division = "+c);
		}catch (ArithmeticException e) {
			//System.out.println("Denominator should not be zero");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
			//System.out.println("Please enter atleast two numbers");
		}
		catch (NumberFormatException e) {
			//System.out.println("Enter only integer");
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("ERROR!!!");
		}
	}
}
