package first;

import java.util.Scanner;

public class Switch {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b, c = 0, ans;
		char ch;

		do {

			System.out.println("a.Addition\nb.Substraction\nc.Multiplication\nd.Division\ne.Exit");
			System.out.println("Enter your choice = ");
			ch = s.next().charAt(0);

			switch (ch) {
			case 'a':
				System.out.println("Enter any two numbers : ");
				a = s.nextInt();
				b = s.nextInt();
				c = a + b;
				System.out.println(a + "+" + b + " = " + c);
				break;

			case 'b':
				System.out.println("Enter any two numbers : ");
				a = s.nextInt();
				b = s.nextInt();
				if (a > b)
					c = a - b;
				else {
					c = b - a;
				}
				System.out.println(a + "-" + b + " = " + c);
				break;

			case 'c':
				System.out.println("Enter any two numbers : ");
				a = s.nextInt();
				b = s.nextInt();
				c = a * b;
				System.out.println(a + "*" + b + " = " + c);
				break;

			case 'd':
				System.out.println("Enter any two numbers : ");
				a = s.nextInt();
				b = s.nextInt();
				if (b == 0) {
					System.out.println("Denominator should not be zero");
				}
				c = a / b;
				System.out.println(a + "+" + b + " = " + c);
				break;

			case 'e':
				System.exit(0);

			default:
				System.out.println("Wrong Choice!!!");

			}

			System.out.println("Do you want to continue??(1/0)");
			ans = s.nextInt();
		} while (ans != 0);
	}

}
