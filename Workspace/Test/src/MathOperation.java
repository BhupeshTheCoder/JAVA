import java.util.Scanner;

public class MathOperation {

	private int x,y;
	
	public int add(int x, int y) {
		int a = x+y;
		return a;
	}
	
	public int mul(int x, int y) {
		int a = x*y;
		return a;
	}
	
	public int pow(int x, int y) {
		int a = x;
		int b = y;
		int c = 1;
		while(b !=0) {
			c = c*x;
			b--;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = s.nextInt();
		System.out.print("Enter y: ");
		int y = s.nextInt();
		MathOperation m = new MathOperation();
		System.out.println("ADDITION is: "+m.add(x, y));
		System.out.println("MULTIPLICATION is: "+m.mul(x, y));
		System.out.println("POWER is: "+m.pow(x, y));
 }
}
