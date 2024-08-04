package pack2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

public static void main(String[] args) {
		//non Genric
	LinkedHashSet s = new LinkedHashSet();
		s.add("A");
		s.add("B");
		s.add(10);
     	s.add(20);
		s.add(40);
		
//		s.add(Null);
	System.out.println(s.add(2));
		System.out.println(s);;
		
	}
}
