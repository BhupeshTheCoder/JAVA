import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		int p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter percentage acquired = ");
		p = s.nextInt();
		
		if((p>=75))
		{
			System.out.println("Distinction");
		}
		else if((p<75) && (p>=65))
		{
			System.out.println("First Class");
		}
		else if((p<65) && (p>=55))
		{
			System.out.println("Second Class");
		}
		else if((p<55) && (p>=45))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
