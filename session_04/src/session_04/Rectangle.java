package session_04;

public class Rectangle extends Shape{
	
	private int l,b;
	
	public Rectangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (l*b);
	}

}
