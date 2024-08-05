package session_07;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		/*
		 * Employee e1 = (Employee)o1; Employee e2 = (Employee)o2;
		 */
		
		/*
		 * String s1 = e1.name; String s2 = e2.name;
		 */
		
		String s1 =(String)o1;
		String s2 =(String)o2;
		
		return s1.compareTo(s2);
	}

}
