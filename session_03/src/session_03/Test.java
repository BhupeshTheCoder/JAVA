package session_03;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size,r,m1,m2,m3;
		String name;
		System.out.println("Enter number of students: ");
		size = s.nextInt();
		Student[] a = new Student[size];
		
		System.out.println("Read Student data: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter rollNo: ");
			r = s.nextInt();
			System.out.println("Enter name: ");
			name = s.next();
			System.out.println("Enter marks of subject1 : ");
			m1 = s.nextInt();
			System.out.println("Enter marks of subject2 : ");
			m2 = s.nextInt();
			System.out.println("Enter marks of subject3 : ");
			m3 = s.nextInt();
			
			a[i] = new Student(r, name, m1, m2, m3);	
		}
		
		System.out.println("Display Student Details : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getRn()+" "+a[i].getName()+" "+a[i].getM1());
		}
		
	}

}
