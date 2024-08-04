package Pack4;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class Cls = Class.forName("Pack4.MyDate");
		System.out.println("Class= "+Cls.getName());
		
		Class SuperCls = Cls.getSuperclass();
		System.out.println("SuperClass: "+SuperCls);
		
		
		System.out.println("----Constructors----");
		Constructor construct[] = Cls.getConstructors();
		for(int i = 0; i<construct.length;i++) {
			System.out.println(construct[i]);
		}
		
		System.out.println("----Methods----");
		Method method[] = Cls.getMethods();
		for(int i = 0; i<method.length;i++) {
			System.out.println(method[i]);
		}
		
		System.out.println("----Fields----");
		Field field[] = Cls.getFields();
		for(int i = 0; i<field.length;i++) {
			System.out.println(field[i]);
		}
		
		
		
	}

}
