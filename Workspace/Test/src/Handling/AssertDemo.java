package Handling;

import java.util.Scanner;

public class AssertDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = s.nextInt();
		assert age >=18: "Not Eligible For Voting";
		System.out.println("Age: "+age);
	}
}
