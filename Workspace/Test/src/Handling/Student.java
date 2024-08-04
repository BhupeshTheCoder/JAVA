package Handling;

import java.util.Scanner;

public class Student {
       protected int rollno, percentage;
       protected Scanner s = new Scanner(System.in);
       public Student() {}

	   public Student(int rollno, int percentage) {
		super();
		this.rollno = rollno;
		this.percentage = percentage;
	}
	   public void getData() {
		   System.out.println("Enter Roll No: "+rollno);
		   rollno = s.nextInt();
		   System.out.println("Enter Percentage: "+percentage);
		   percentage = s.nextInt();
	   }
	   
	   public void getDisplay() {
		   System.out.println("Roll no: "+rollno+"\t Percentage");
	   }
       
       
       
       
}
