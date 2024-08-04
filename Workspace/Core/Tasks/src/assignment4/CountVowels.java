package assignment4;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter you name :");
//		String name = s.nextLine();
//		
//		char na[]= name.toCharArray();
//		int count=0;
//		
//		for(char c:na) {
//			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'
//					||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println("No. of vowels :");		
//		
//	}
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String str=s.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(str+" no of vowels= "+count);
	}
}
