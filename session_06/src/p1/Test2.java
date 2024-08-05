package p1;

import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		TreeSet<Integer> t =new  TreeSet<Integer>();
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		t.add(20);
		
		System.out.println(t);//[0,10,15,20]
	}
}

/*
 * 10 [10] 0 0.compareTo(10) [0,10] 15 15.compareTo(0) [0,15,10]
 * 15.compareTo(10) [0,10,15] 10 0 10 10 15
 */