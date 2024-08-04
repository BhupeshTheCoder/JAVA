package Handling;

public class B extends A{
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
	}

}
