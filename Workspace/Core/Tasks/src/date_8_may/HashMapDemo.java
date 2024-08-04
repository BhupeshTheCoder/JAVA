package date_8_may;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h =new HashMap();
		h.put("Chitra",600);
		h.put("Asha",900);
		h.put("Sushma",700);
		h.put("Rekha",800);
		
		
		System.out.println(h);
		System.out.println(h.put("Chitra", 100));
		System.out.println(h);
		
		
		Set s =h.keySet();
		System.out.println(s);
		
		
		Collection c = h.values();
		System.out.println(c);
		
		
		
		Set s1 =h.entrySet();
		System.out.println(s1);
		
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("Asha"))
			{
				m1.setValue(1000);
			}
		
		}
		System.out.println(h);
}
}