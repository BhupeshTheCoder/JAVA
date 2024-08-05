package session_05;

public class Test {
	
	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "Java";
		String s3 = " java ";
		String s4 = new String("java");
		String s5 = "java";
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.compareTo(s4));
		/*
		 * s1> s2 = +ive s1<s2 = -ive s1 = s2 = 0
		 */
		
	/*	charAt()
		length()
		subString()
		toUpperCase()
		toLowerCase()
		contains()
		isEmpty()
		replace()
		trim()
		
		*/
		
		
	/*	:: Method Reference
		
		SYstem.out::println
		
		class::staticMethod_name
		*/
		
		
		
	}

}
