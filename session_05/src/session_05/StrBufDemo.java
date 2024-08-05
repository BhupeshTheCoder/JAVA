package session_05;

public class StrBufDemo {
	
	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Infoway");
		System.out.println(a);
		a.append(" Technologies");
		System.out.println("a = "+a);
		a.insert(1, "Java");
		System.out.println("Insert = "+a);
		a.delete(1, 5);
		System.out.println("Delete = "+a);
		a.replace(3, 6, "Rahul");
		System.out.println(a);
		a.reverse();
		System.out.println(a);
	}

}
