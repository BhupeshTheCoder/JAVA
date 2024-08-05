package deepClone;

public class Student extends Object implements Cloneable {

	int rn;
	String name;
	Course course;
	
	public Student(int rn, String name, Course course) {
		super();
		this.rn = rn;
		this.name = name;
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s =(Student) super.clone();
		s.course = (Course) course.clone();
		return s;
	}
	
}
