package pack1;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "java";
		String s3 = " ";
		String s4 = "java";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1==s4);
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.substring(1, 3));
		System.out.println(s3.isEmpty());
		System.out.println(s1.contains(s4));
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
	}
}
