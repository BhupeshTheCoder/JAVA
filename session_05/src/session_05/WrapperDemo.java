package session_05;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(no);//primitive to Wrapper - boxing
		System.out.println(i);
		
		int a = i.intValue();//Wrapper to Primitive - Unboxing
		System.out.println(a);
		
		String s = "30";
		int b = Integer.parseInt(s);//String to Primitive
		System.out.println(b);
		
		String str = "20";
		Integer m = Integer.valueOf(str);//String to Wrapper
		System.out.println(m);
		
		
		int c = 100;
		Integer d = c;//auto-boxing
		int e = d; // auto-unboxing
		
		
		
		
	}

}
