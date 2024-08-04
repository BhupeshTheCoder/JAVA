package programAlgorithm;

import java.util.Scanner;

public class MainIntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, data;
		Scanner sc = new Scanner(System.in);
		IntStack st = new IntStack();
		
		do {
			System.out.println("\n 1. Push");
			System.out.println("\n 2. Pop");
			System.out.println("\n 3. Peek");
			System.out.println("\n 4. Display");
			System.out.println("\n 5. Exit");
			System.out.println("\n Enter your Choice");
			
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter value");
			        data = sc.nextInt();
			        st.push(data);
			        break;
			case 2: 
	                data = st.pop();
	                if(data != -9) {
	                	System.out.println(data+"popped");
	                	break;
	                }  
			case 3: 
                    data = st.peek();
                    if(data != -9) {
                	System.out.println(data+"top");
                	break;
                }
			case 4:
				   System.out.println(st);
				   break;
			}
			
		} while (ch != 5);
		

	}

}