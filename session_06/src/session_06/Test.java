package session_06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(new java.util.Date());
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
		String str = s.format(d);//formatting Date to String
		System.out.println("str = "+str);
		
		Date d1 = s.parse(str);//parsing - String to Date
		System.out.println("Date = "+d1);
		
	}

}
