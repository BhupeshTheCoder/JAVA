import java.util.Scanner;

public class TernaryDemo {
	
	public static void main(String[] args) {
		
		int a,b,max=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		a = s.nextInt();
		b = s.nextInt();
		
		max = (a>b) ? a : b ;
		
		System.out.println("Maximum of "+a+" and "+b+" = "+max);
		
	}
}

/*
 * c = a+b;
 * 
 * c = a++;
 * 
 * (a>b) ? a : b; ?:
 */