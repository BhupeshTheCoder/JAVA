package session_08;

import java.io.FileOutputStream;

public class Demo {
	
	public static void main(String[] args) {
	
		try(FileOutputStream fos= new FileOutputStream("z://pqr.txt", true))
		{
			
			
			String str = "Hello Java!!! Welcome to Infoway Technologies, Kothrud";
			byte[] b = str.getBytes();
			fos.write(b);
			System.out.println("Success");
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
