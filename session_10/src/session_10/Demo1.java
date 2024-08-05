package session_10;

import java.util.function.Consumer;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Consumer<String> c = (s) -> System.out.println(s.length()+" "+s);
		c.accept("Welcome to Infoway");
		
		
		Consumer<Integer> i = (x) -> {
			
			System.out.println(x*x);
			System.out.println(x/x);
			
		};
		
		i.accept(10);
	}

}
