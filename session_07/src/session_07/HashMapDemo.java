package session_07;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<String, String>();//16
		h.put("Mayuri", "100");
		System.out.println(h);
		System.out.println(h.put("Mayuri", "111"));//100
		System.out.println(h);
	}

}
