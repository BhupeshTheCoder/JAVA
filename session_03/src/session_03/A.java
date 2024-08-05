package session_03;
//public class A extends FinalDemo{ //final class cannot be extended
public class A {
	
	public A() {
		//default
	}
	
	public A(int a,int b)
	{
		//parameterized
	}
	
	/*
	 * public void get() { //final method cannot be overridden
	 * 
	 * }
	 */

	public static void main(String[] args) {
		final A a = new A(); //making reference as final
		a = new A();
		
		int no = 10;
		no = 20;	
	}	
}
