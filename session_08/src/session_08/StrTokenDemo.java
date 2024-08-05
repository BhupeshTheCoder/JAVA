package session_08;

import java.util.StringTokenizer;

public class StrTokenDemo {
	
	static String str = "Java=Mayuri;"+"Angular=Rahul;";
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer(str, "=;");
		
		while(st.hasMoreTokens())
		{
			
			String key = st.nextToken();
			String value = st.nextToken();
			System.out.println(key+"\t"+value);
			
		}
		
		
	}

}
