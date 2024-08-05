import java.io.Console;

public class ConsoleDemo {	
	
	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Enter your name = ");
		String name = c.readLine();//reads a single line of text from the console
		System.out.println("Welcome "+name);
		System.out.println("Enter password = ");
		char[] pwd=c.readPassword();
		String str = String.valueOf(pwd);
		System.out.println("Password= "+str);
	}

}
