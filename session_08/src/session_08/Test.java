package session_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("z://data.txt"));
		Employee e= (Employee)ois.readObject();
		System.out.println(e.empId+" "+e.empName);
		ois.close();
		
	}

}
