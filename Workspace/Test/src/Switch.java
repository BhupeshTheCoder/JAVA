import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char ch, ans;
		int a,b,s1=0;
		do{
			System.out.println("a. ADDITION\tb. SUBTRACTION\tc. MUTLIPLICATION\td. DIVISION");
			System.out.print("Enter Your Choice: ");
			ch=s.next().charAt(0);
		
			System.out.println("Enter any First= ");
			a= s.nextInt();
			System.out.println("Enter any Second= ");
			b= s.nextInt();
		
		switch(ch){
		case'a':
			s1=a+b;
			System.out.println("ADDITION "+s1);
			break;
		case'b':
			s1=a+b;
			if(a>b) {
				s1=(a-b);
			}
			else {
				s1=(b-a);
			}
			System.out.println("SUBTRACTION= "+s1);
			break;
		case'c':
			s1=a*b;
			System.out.println("MULTIPLICATION "+s1);
			break;
		case'd':
			if(b == 0) {
				System.out.println("Denominator should not be zero");
			}
			else {
				s1=a/b;
				System.out.println("DIVISION= "+s1);
			}
			break;
		case'e':
			System.out.println("Goodbye!!!");
			break;
		default:
			System.out.println("wrong choice");	
		}
		}
		while (true);
		
		
		
	}

}
