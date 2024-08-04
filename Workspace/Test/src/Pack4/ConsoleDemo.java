package Pack4;

import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		
		Console c = System.console();
		System.out.println("Enter your Name= ");
		String name = c.readLine();
		
		System.out.println("Welcome "+ name);
		System.out.println("Enter a Password: ");
		char[] pwd = c.readPassword();
		String str = String.valueOf(pwd);
		System.out.println("Password "+str);
	}

}
