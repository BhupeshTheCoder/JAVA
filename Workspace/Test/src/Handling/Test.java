package Handling;

public class Test {

	public static void main(String[] args) throws ArithmeticException {
		try {
			int a,b,c=0;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			
			c =a/b;
			System.out.println("c: "+c);
		}catch(Exception e) {
			System.out.println("Exception occured!!!");
		}
		System.out.println("Continue...");
	}
}
