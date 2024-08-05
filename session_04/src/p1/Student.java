package p1;
public class Student implements Cloneable{

	private int rn;
	private String name;

	public Student(int rn, String name) {
		super();
		this.rn = rn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + "]";
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student(1, "Rahul");
		System.out.println(s1);
		Student s2 = (Student) s1.clone();
		System.out.println(s2);
	}

}
