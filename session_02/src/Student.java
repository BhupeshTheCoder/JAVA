
public class Student {
	
	private int rn;
	private String name;
	private static int count;
	
	public Student() {}

	public Student(int rn, String name) {
		this.rn = rn;
		this.name = name;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	static
	{
		System.out.println("Static Block");
		count = 50;
	}
	
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name +" count= "+count+"]";
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		Student s1 = new Student(1,"Rahul");
		System.out.println(s1);
		Student s2 = new Student(2,"Vishal");
		System.out.println(s2);
		Student s3 = new Student(3,"Aishwarya");
		System.out.println(s3);
		//Classname.static_method;
		int c = Student.getCount();
		System.out.println("Total number of Students = "+c);
	}
	
}
