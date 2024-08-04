package pack3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("ABC", 111);
		h.put("pqr", 666);
		h.put("xyz", 222);
		h.put("lmn", 333);
		
		System.out.println(h);
		
		 
		
		Collection c = h.values();
		System.out.println(c);
		
		Collection s = h.keySet();
		System.out.println(s);
		
		Set z = h.entrySet();
		System.out.println(z);
		
		Iterator itr = z.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+""+m1.getValue());
			if(m1.getKey().equals("lmn")) {
				m1.setValue(100);
				System.out.println(h);
			}
			
		}
	}
	

}
