package session_10;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("abc");
		a.add("mno");
		a.add(10);
		a.add(null);
		
		/*
		 * for(Object o:a) { System.out.println(o); }
		 */
		
		a.forEach((n)-> System.out.println(n));
		
		
		
	}
	
}
