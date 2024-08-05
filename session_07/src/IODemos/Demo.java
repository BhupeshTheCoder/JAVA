package IODemos;

import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello Java");
		
		int i  = System.in.read();
		System.out.println((char)i);
		
		System.err.print("Error Ocurred!!!");
		
		
	}

}

/*
 * Standard Output Stream
 *  Standard Input Stream 
 *  Standard Error Stream
 */
