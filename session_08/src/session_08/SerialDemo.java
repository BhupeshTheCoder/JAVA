package session_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new Employee(111,"Rahul");
		
		FileOutputStream fos = new FileOutputStream("z://data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		
		System.out.println("Success");
		oos.close();
		fos.close();
		
	}

}
