import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

		int no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number = ");
		no = s.nextInt();

		if ((no % 2) == 0) {
			System.out.println("Even Number = " + no);
		} else {
			System.out.println("Odd Number = " + no);
		}

	}

}

/*
 * if(condition) { //stmts; }
 */
