import java.util.Scanner;

public class Maximum {
	public int maximum(int a, int b) {
		int m = (a>b)?a:b;
		return m;
	}
	public static void main(String[] args) {
		Maximum m = new Maximum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any First no: ");
		int a = s.nextInt();
		System.out.println("Enter Second no");
		int b = s.nextInt();
		System.out.println("Maximum No is: "+m.maximum(a, b));
	}

}
