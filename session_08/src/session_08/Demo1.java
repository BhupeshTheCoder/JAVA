package session_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		
		/*
		 * FileWriter fw = new FileWriter("z://pqr.txt",true);
		 * fw.write("Core Java Training"); fw.close();
		 */
		 
		
		  FileReader fr = new FileReader("z://pqr.txt"); 
		  int i;
		  while((i=fr.read())!=-1) 
		  { 
			  System.out.print((char)i); 
		  } 
		  fr.close();
		 
		//System.out.println("Success");
		
	}

}
