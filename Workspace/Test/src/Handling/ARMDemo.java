package Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ARMDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("e://mono.txt");FileOutputStream fis = new FileOutputStream("e://mono.txt")){
		String str = "welcome to CDAC";
		byte[]b = str.getBytes();
		fos.write(b);
		System.out.println("SUCCESS");
		}
	}
}