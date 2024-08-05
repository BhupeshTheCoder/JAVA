package session_05;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		boolean b = Pattern.matches("..va", "java");
		System.out.println(b);
		System.out.println(Pattern.matches("[^abc]", "h"));
		System.out.println(Pattern.matches("[abc]", "a"));
	
		
	}
	
}
