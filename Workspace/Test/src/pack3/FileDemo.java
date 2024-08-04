package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Group055\\Documents\\mno.txt");
		int x =0;
		while((x=fis.read())!=-1) {
			System.out.println((char)x);
		}
	}

}
