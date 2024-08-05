package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		//HashSet h =new HashSet();
		LinkedHashSet h = new LinkedHashSet();
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		//h.add(10);
		h.add(null);
		System.out.println(h.add(2));//false
		System.out.println(h);
		
	}

}
