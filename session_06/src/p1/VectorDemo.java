package p1;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Capacity = "+v.capacity());//10
		
		for(int i=1;i<=9;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		
		System.out.println("Size = "+v.size());
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = e.nextElement();
			if(i%2 == 0)
				System.out.println(i);
		}
		System.out.println(v);	
	}
}
