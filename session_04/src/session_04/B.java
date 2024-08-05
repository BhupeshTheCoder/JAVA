package session_04;
public class B extends A{	
	private int b = 11;
	
	public void getB() 
	{
		System.out.println("b = "+b);
	}
	
	public void m1()
	{
		System.out.println("In m1() if B");
	}
	
	@Override
	public void m2()
	{
		System.out.println("In m2() of B");
	}
	
	public static void main(String[] args) {
		/*
		 * B b = new B(); 
		 * b.getA(); 
		 * b.getB();
		 */
		
		//polymorphic reference
		//super_class ob = new sub_class();
		A ob = new B();
		((B) ob).m1();
		ob.m2();
	}

}
