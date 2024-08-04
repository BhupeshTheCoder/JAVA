import java.util.Scanner;

public class Simple_Interest {
	
	public float Si (int p, float r, int t) {
		float s = ((p*r*t)/100);
		return s;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter principle: ");
		int p = s.nextInt();
		
		System.out.print("Enter rate: ");
		float r = s.nextFloat();
		
		System.out.print("Enter time: ");
		int t = s.nextInt();
		
		//object to call the function
		Simple_Interest obj = new Simple_Interest();
		
		System.out.println("Simple Interest on given sum: "+obj.Si(p, r, t));
	}

}
