package p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(56);
		a.add(89);
		a.add(90);
		//a.add("Mayuri");
		a.add(10);
		//a.add(null);
		//a.add('A');
		System.out.println(a);
		/*
		 * a.remove(0); System.out.println(a); a.add(1, 10.7f); System.out.println(a);
		 * //Synchronized Version of Arraylist List l = Collections.synchronizedList(a);
		 */	
		
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext())
		{
			/*
			 * Integer i = itr.next(); int b = i;
			 */
			
			int i = itr.next();
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
		
		System.out.println(a);
		
		
		
		
		
		
		
		
	}
}
