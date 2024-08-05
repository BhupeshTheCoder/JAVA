package p1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Ajinkya");
		l.add("Swapnil");
		l.add("Darshita");
		l.add("Ishwar");
		l.add("Kalpesh");
		
		System.out.println("Foward Direction ");
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Backward Direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
