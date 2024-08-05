package deepClone;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Course c = new Course("Math", "Science", "Geometry");
		Student s1 = new Student(1, "Rahul", c);
		
		Student s2 = null;
		
		s2 = (Student)s1.clone();
		
		System.out.println(s1.course.c2);
		s1.course.c2 = "History";
		System.out.println(s2.course.c2);
		
		
	}

}
