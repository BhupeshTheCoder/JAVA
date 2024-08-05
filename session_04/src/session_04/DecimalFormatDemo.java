package session_04;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	
	public static void main(String[] args) {
		
		double a = 123.73827328;
		DecimalFormat d = new DecimalFormat("0.00");
		System.out.println(d.format(a));
		System.out.println("Format = "+String.format("%.2f", a));
		
		
	}

}
