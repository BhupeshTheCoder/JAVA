package Handling;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;


public class Array1 {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add(10);
		l.add("Madhav");
		l.add(20);
		l.add(null);
		//System.out.println(l);
		
		Integer i = (Integer) l.get(0);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


