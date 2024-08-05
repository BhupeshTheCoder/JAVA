package p1;

import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {	
		TreeSet t = new TreeSet();
		/*
		 * t.add("A"); 
		 * t.add("z"); 
		 * t.add("a"); 
		 * t.add("Z"); 
		 * t.add("b");
		 * //t.add(10);//ClassCastException 
		 * t.add(null);//NullPointerException
		 */		
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("m"));
		t.add(new StringBuffer("o"));
		
		System.out.println(t);	
	}
}

//All String and Wrapper classes implements Comparable Interface

