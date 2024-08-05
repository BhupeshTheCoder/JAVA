package session_07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap h = new HashMap();//16
		h.put("Chitra", 700);
		h.put("aishwarya", 800);
		h.put("Vishakha", 200);
		h.put("nilesh", 500);
		//System.out.println(h);
		
		//System.out.println(h.put("Chitra", 100));//700
		
		Set s = h.keySet();
		System.out.println(s);
		
		/*
		 * Collection c = h.values(); System.out.println(c);
		 */
		Set s1 = h.entrySet();
		System.out.println(s1);
		
		/*
		 * Iterator itr = s1.iterator(); while(itr.hasNext()) { Map.Entry m1 =
		 * (Map.Entry)itr.next(); System.out.println(m1.getKey()+" "+m1.getValue());
		 * if(m1.getKey().equals("nilesh")) { m1.setValue(1000); } }
		 * System.out.println(h);
		 */
	}

}
