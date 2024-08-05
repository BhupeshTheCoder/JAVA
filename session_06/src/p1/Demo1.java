package p1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		//l.add("abc");//CTE
		l.add(56);
		l.add(89);
		
		for(Integer i :l)
		{
			int a = i;
			System.out.println(a);
		}	
	}
}
