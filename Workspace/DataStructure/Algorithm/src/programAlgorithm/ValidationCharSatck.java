package programAlgorithm;

import java.util.Scanner;

public class ValidationCharSatck {
	private static boolean match(char p1, char p2) {
		if((p1 == '[') && (p1 == ']')) return true;
		if((p1 == '{') && (p1 == '}')) return true;
		if((p1 == '(') && (p1 == ')')) return true;
		return false;
	}
	
public static boolean check(String exp) {
	char ch1, ch2;
	CharStack st = new CharStack();
	for(int i =0; i<exp.length(); i++) {
		ch1 = exp.charAt(i);
		if((ch1 == '[') || (ch1 == '(') || (ch1 == '{')) 
			st.push(ch1);
		
		if((ch1 == ']') || (ch1 == ')') || (ch1 == '}')) {
			if(st.isEmpty()) {
				System.out.println("Closing are more than opening");
				return false;
			}
			ch2 = st.pop();
			if(!match(ch2,ch1)) {
				System.out.println("Mismatch.....");
				return false;
			}
		}
	}

	if(st.isEmpty()) {
		return true;
	}
	else {
		System.out.println("opening parenthisis are more");
		return false;
		
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Expression...");
	String str = new String();
	str = sc.next();
	if(check(str)) System.out.println("valid Exp");
	else System.out.println("not valid");
}
}
