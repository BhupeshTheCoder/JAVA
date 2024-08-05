package session_07;

import java.util.TreeSet;

public class Test1 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(5, "Rahul");
		Employee e2 = new Employee(1, "Priyanka");
		Employee e3 = new Employee(2, "Vishal");
		Employee e4 = new Employee(8, "Omkar");
		Employee e5 = new Employee(4, "Rohit");
		
		//TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
	}

}
