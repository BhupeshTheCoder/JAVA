package p2;

import java.util.concurrent.ConcurrentHashMap;

public class Test1 {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(101, "Mayuri");
		System.out.println(m.put(101, "Rahul"));//Mayuri
		System.out.println(m);
		
		m.putIfAbsent(101, "qwerty");
		System.out.println(m);
		
		m.remove(101, "abc");//value associated with key if not matched will not remove
		System.out.println(m);
		
		m.replace(101, "Rahul", "mno");
		System.out.println(m);
	}

}
