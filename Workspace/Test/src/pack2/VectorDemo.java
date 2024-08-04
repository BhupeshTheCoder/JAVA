package pack2;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println("Size = "+v.size());
		
		
		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements()) {
			Integer i =e.nextElement();
			if((i%2)==0) {
				System.out.println(i);
			}
			//System.out.println(v);
		}
		
		
		
		
		
	}

}
