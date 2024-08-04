package pack2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo implements Comparator<Integer>{

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet(new TreeSetDemo());          //Descending 
	     
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(80);
		t.add(50);
		t.add(400);
		System.out.println(t);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) return +1;
		else if(o1>o2) return -1;
		else
		return 0;
	}
}
