package programAlgorithm;

import java.util.Scanner;

public class CharStackMain {
    public static void main(String[] args) {
		int ch;
		char data;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the Char Stack");
		int size = sc.nextInt();
		CharStack c = new CharStack(size);
		
		do {
			System.out.println("\n 1. Push");
			System.out.println("\n 2. Pop");
			System.out.println("\n 3. Peek");
			System.out.println("\n 4. Display");
			System.out.println("\n 5. Exit");
			System.out.println("\n Enter your Choice");
			
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("\n Enter value");
			        data = sc.next().charAt(0);
			        c.push(data);
			        break;
			case 2: data = c.pop();
			        if(data != '@') {
			        	System.out.println(data+"popped");
	                	break;
			        }
			case 3: data = c.peek();
	                if(data != '@') {
	        	    System.out.println(data+"top");
            	    break;
	        }  
			case 4: System.out.println(c);
    	            break;
			case 5: break;
			        default:
			        System.out.println("\n Enter Valid Choice");
           }
		}while(ch != 5);
		}
}