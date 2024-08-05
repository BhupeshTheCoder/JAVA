package session_03;
public class Student {
	
	private int rn;
	private String name;
	private int m1,m2,m3;
	
	public Student() {}
	
	public Student(int rn, String name, int m1, int m2, int m3) {
		super();
		this.rn = rn;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getRn() {
		return rn;
	}

	public String getName() {
		return name;
	}

	public int getM1() {
		return m1;
	}

	public int getM2() {
		return m2;
	}

	public int getM3() {
		return m3;
	}

	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

}
