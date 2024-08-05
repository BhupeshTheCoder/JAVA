package session_04;

public class D extends C{
	
	public D()
	{
		super();
		System.out.println("Default Constructor in Class D");
	}
	
	public D(int a)
	{
		super(10);
		System.out.println("In Parameterized Constructor of Class D");
	}
	
	
	public static void main(String[] args) {
		//D c = new D();
		D c = new D(10);
	}

}
