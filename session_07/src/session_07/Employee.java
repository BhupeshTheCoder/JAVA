package session_07;
public class Employee implements Comparable {
	public int id;
	public String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Object o) {
		int e1 = this.id;
		Employee e = (Employee)o;
		int e2 = e.id;
		if(e1<e2)
			return +1;
		else if(e1>e2)
			return -1;
		else
		return 0;
	}

}
