package Handling;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList l = new LinkedList();
		l.add("Madhav");
		l.add(21);
		l.add(null);
		System.out.println(l);
		l.set(0, "Adi");
		System.out.println(l);
		l.remove();
		System.out.println(l);
		l.addFirst(20);
		System.out.println(l);
		
	}
}
