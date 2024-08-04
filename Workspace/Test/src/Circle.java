import java.util.Scanner;

public class Circle {
	
	public double Area(int a) {
		double x = Math.PI*a*a;
		return x;
	}
	
	//circumference of circle
	public double Circum(int a) {
		double x = 2*Math.PI*a;
		return x;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Radius of circle: ");
		int a =  s.nextInt();
		
		Circle z = new Circle();
		
		System.out.println("Area of circle: "+z.Area(a));
		
		System.out.println("Circumference of Circle: "+z.Circum(a));
	}


}
