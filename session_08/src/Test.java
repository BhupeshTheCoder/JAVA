
/**
 * @author Admin
 *
 */
public class Test {
	
	/**
	 * a is of type int
	 * a is instance variable
	 */
	private int a;
	
	/**
	 * Default Constructor of class Test
	 */
	public Test() {}
	
	/**
	 * Parameterized Constructor
	 * @param a
	 */
	public Test(int a)
	{
		this.a=a;
	}
	
	/**
	 * @return int
	 */
	public int getA()
	{
		return a;
	}
	
	/**
	 * user-defined method
	 */
	public void display()
	{
		System.out.println("a = "+a);
	}

}
