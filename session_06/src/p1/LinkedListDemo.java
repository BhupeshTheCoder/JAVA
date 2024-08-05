package p1;
import java.util.LinkedList;
public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("mayuri");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0,"rahul");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(40);
		System.out.println(l);
	}
}
