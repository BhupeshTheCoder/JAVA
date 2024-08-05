package p1;

public class A {
	
	protected int a = 10;
	
	public void get()
	{
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.get();
	}

}
