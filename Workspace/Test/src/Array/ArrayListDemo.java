package pack2;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i =0; i<=10;i++) {
			a.add(i);
		}
		System.out.println(a);
		
		
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2==0) 
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println(a);
	}
}
