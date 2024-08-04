package pack3;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 =(String)o1;
		String s2 =o2.toString();
		return s2.compareTo(s1);
	}

	
//	public int compare(Employee o1, Employee o2) {
//		
//		
//		int s1 = o1.empId;
//		int s2 = o2.empId;
//		if(s1<s2) return -1;
//		else if(s1>s2) return +1;
//		else
//		return 0;
//	}
	
	
	
	
	

}
