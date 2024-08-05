package session_06;

import java.util.Scanner;

public class AssertDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age  : ");
		int age = s.nextInt();
		
		assert age>=18 : "Not Valid for Voting";
		
		System.out.println("You are Eligible for Voting : "+age);
		
		
	}
	
}
