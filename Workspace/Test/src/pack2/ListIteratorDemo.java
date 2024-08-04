package pack2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.push("Shreyansh");
		l.push("Kartik");
		l.push("Madhav");
		System.out.println("Forward Direction");
		
		ListIterator<String> itr = l.listIterator(l.size());
//		while(itr.hasNext()) {
//			
//			String str = itr.next();
//			if(str.equals("Kartik")) {
//				itr.set("Bhaiyu");
//			}
//			
//		
//		}
		System.out.println(l);
		System.out.println("Backward Direction Iteration:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
			
        }
//        System.out.println(l);
	}

}
