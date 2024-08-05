package deepClone;

public class Course implements Cloneable{
	
	String c1,c2,c3;

	public Course(String c1, String c2, String c3) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
