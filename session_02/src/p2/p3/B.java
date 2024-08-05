package p2.p3;

//import p1.A;
import p1.*;
import static p1.Student.*;
import static p1.Student.fees;
import static p1.Student.getFees;
import static java.lang.System.out;

public class B extends A{
public static void main(String[] args) {
		
		B b = new B();
		out.println(b.a);
		
		//Student s = new Student();
		//Student.getFees();
		getFees();
		
	}

}
