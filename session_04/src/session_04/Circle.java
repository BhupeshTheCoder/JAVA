package session_04;

public class Circle extends Shape{
	
	private int r;
	private final float PI = 3.14f;
	
	public Circle(int r)
	{
		this.r=r;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (PI*r*r);
	}

}
