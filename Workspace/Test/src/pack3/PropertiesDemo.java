package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
   public static void main(String[] args) throws IOException {
	
	   Properties p = new Properties();
	   FileInputStream fis = new FileInputStream("C:\\Users\\Group055\\Documents\\mno.txt");
	   p.load(fis);               //load property file in java property object
	   System.out.println(p);
	   String s = p.getProperty("user");
	   System.out.println(s);
}

}
