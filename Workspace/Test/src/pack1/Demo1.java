package pack1;

public class Demo1 {

	public static void main(String[] args) {
		
		int no =10;
		Integer i = new Integer(no);
		
		int a=100;
		
		Integer b=a;
		
		
		//Wrapper to primitive
		int c = i.intValue();
		int d=b;                   //Auto-boxing
		
		//string to primitive
		String str ="40";
		int s = Integer.parseInt(str);
		
		//String to Wrapper
		
		Integer t = Integer.valueOf(s);
		
		System.out.println("t= "+t);
		
	}
}
