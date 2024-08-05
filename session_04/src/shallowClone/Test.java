package shallowClone;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course c= new Course("Math", "Science", "History");
		Student s1 = new Student(1,"Rahul",c);
		Student s2 = null;
		s2 =(Student) s1.clone();
		System.out.println(s1.course.c2);
		s2.course.c2 = "Env";
		System.out.println(s1.course.c2);
	}

}
