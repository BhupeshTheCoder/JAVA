package session_07;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Test, String> h= new Hashtable<Test, String>();
		
		h.put(new Test(5), "A");
		h.put(new Test(2), "B");
		h.put(new Test(6), "C");
		h.put(new Test(15), "D");
		h.put(new Test(23), "E");
		h.put(new Test(16), "A");
		
		System.out.println(h);
		
	}

}
