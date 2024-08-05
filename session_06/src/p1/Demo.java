package p1;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = e.nextElement();
			System.out.println(i);
		}
		
		
	}

}
