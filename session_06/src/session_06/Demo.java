package session_06;
import java.util.ArrayList;
public class Demo {	
	public static void main(String[] args) {	
	//ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList a = new ArrayList();
		a.add("Rahul");
		a.add(10);
		a.add(10);
		System.out.println(a.add('c'));
		a.add(null);
		//System.out.println(a);
		for(Object i:a)
		{
			String str =(String) i;
			System.out.println(i);
		}
		//String s1 = a.get(0);	
	}
}
