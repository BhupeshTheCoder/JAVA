package session_10;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable t = new Hashtable();
		t.put(new Test(5), "A");
		t.put(new Test(2), "B");
		t.put(new Test(6), "C");
		t.put(new Test(15), "D");
		t.put(new Test(23), "E");
		t.put(new Test(16), "F");
		
		System.out.println(t);	
	}
}
