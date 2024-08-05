package shallowClone;
public class Student implements Cloneable
{
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
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
	
	

}
