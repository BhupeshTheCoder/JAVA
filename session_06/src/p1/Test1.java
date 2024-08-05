package p1;

public class Test1 {

	
	public static void main(String[] args) {
		
		System.out.println("A".compareTo("a"));
		System.out.println("z".compareTo("Z"));
		//System.out.println(new Integer(10).compareTo("abc"));
		System.out.println("p".compareTo(null));//NullPointerException
		
	}
}
