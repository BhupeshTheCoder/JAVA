package pack2;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap();
		
		hm.put(10, "ABC");
		hm.put(20, "XZY");
		hm.put(5,"PQR");
		hm.put( 5,"");
		hm.put( 6,"");                      //values can be null n times where as key can't be null even once also
		//hm.put( "",7);                   //applicable only in non-genric 
		
		
		System.out.println(hm);
//		System.out.println(hm.put(5,"");
		
	}
}
