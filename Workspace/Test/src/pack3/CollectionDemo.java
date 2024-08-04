package pack3;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();+
		l.add("z");
		l.add("a");
		l.add("c");
		l.add("e");
		//l.add(new Integer(10));        ///ClassCastException
		//l.add();                       // nullpointer Exception
		
		System.out.println("Before Sorting-- "+1);
		Collection.sort(l.new MyComparator());
		
		
		
		
		
	}

}
