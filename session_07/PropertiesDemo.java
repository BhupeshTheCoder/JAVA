

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);//loads properties file in java Property Object
		System.out.println(p);
		String s = p.getProperty("user");//returns value associated with the property
		System.out.println(s);
		
	}
}

/*
 * Properties: Child class of Hashtable.
 */
	
