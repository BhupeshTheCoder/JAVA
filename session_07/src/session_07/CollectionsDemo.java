package session_07;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {	
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("C");
		
		//l.add(new Integer(10));//ClassCastException
		//l.add(null);//NullPointerException
		System.out.println("Before Sorting - "+l);
		//Collections.sort(l);
		Collections.sort(l, new MyComparator());
		System.out.println("After Sorting - "+l);
	}

}
