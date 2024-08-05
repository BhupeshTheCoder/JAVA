package session_05;

import java.util.regex.Pattern;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s = "Java is an Object Oriented Language";
		//String str[] = s.split("\\s");
		String str[] = s.split("O");
		for(String i:str)
		{
			System.out.println(i);
		}	
	}

}
