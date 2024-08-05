package session_04;
import java.util.Scanner;
public class Person {
	
	private String fname;
	private String lname;
	private int age;
	protected Scanner s = new Scanner(System.in);

	public void getData()
	{
		System.out.println("Enter your firstName : ");
		fname = s.next();
		System.out.println("Enter your lastName : ");
		lname = s.next();
		System.out.println("Enter your age : ");
		age = s.nextInt();
	}
	
	public void showData()
	{
		System.out.println("Details: [ "+fname+" "+lname+" "+age+" ]");
		
	}	
}
