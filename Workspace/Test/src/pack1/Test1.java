package pack1;
public class Test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.append("Trainer");
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		
	}
}
