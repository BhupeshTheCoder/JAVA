package Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("e://mono.txt");
	    try {
	    	fos.write(123456789);
	    }catch(Exception e) {}
	    finally {
	    	System.out.println("Finally Block");
	    	fos.close();
	    }
	
	
	
	
	}
}
