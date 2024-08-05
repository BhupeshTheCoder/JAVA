package session_04;

public class Demo1 {

	public static void main(String[] args) {
		
		//ArithCal a = new ArithCal();cannot be instantiated
		
		Demo d = new Demo();
		d.add(10, 20);
		d.sub(5, 4);
		d.avg(6, 7);
		System.out.println("Max = "+d.max(78, 56));
		System.out.println("Factorial of 5 = "+d.fact(5));
		
	}
}
