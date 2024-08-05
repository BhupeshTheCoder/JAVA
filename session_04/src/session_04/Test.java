package session_04;

public class Test {
	
	public static void main(String[] args) {
		
		//Shape s = new Shape();//cannot be instantiated
		Shape s = new Circle(5);
		System.out.println("Area of circle = "+s.calculateArea());
		s = new Rectangle(4, 5);
		double area = s.calculateArea();
		System.out.println("Area of Rectangle = "+area);
		
	}

}
