package pattern;

import java.util.Scanner;

public class test {
	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num to print Pattern");
		int num=s.nextInt();
		Pattern  p=new Pattern(num);
		Thread t1=new Thread(p);
		t1.start();
		
		
	}

}
