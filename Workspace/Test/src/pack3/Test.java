package pack3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
	
	

	public static void main(String[] args) {
		Employee e1 = new Employee(123,"ABC");
		Employee e2 = new Employee(111,"xyz");
		Employee e3 = new Employee(666,"pqr");
		Employee e4 = new Employee(555,"lmn");
		
		ArrayList t = new ArrayList();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.sort(new MyComparator());
		ListIterator itr=  t.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
