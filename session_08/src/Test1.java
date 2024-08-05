import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class cls = Class.forName("Employee");
		System.out.println("Class = "+cls);
		
		Class sCls = cls.getSuperclass();
		System.out.println("SuperClass = "+sCls);
		
		Method[] m = cls.getMethods();
		System.out.println("Methods are ---->");
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		
		Constructor []c = cls.getConstructors();
		System.out.println("Constructors are ---->");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		Field f[] = cls.getFields();
		System.out.println("Fields are ---->");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}	
	}
}
