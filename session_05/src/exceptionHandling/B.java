package exceptionHandling;

public class B extends A{
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a instanceof B);
		
		A b = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		
		B c = new B();
		System.out.println(c instanceof A);
		System.out.println(c instanceof B);
	}

}
