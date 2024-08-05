package session_03;

public class Employee {
	
	private int id;
	private String name;
	private Date dt_of_joining;
	
	public Employee() {}
	
	public Employee(int id, String name, Date dt_of_joining) {
		
		this.id = id;
		this.name = name;
		this.dt_of_joining = dt_of_joining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dt_of_joining=" + dt_of_joining + "]";
	}
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee(111,"Rahul", new Date(10,5,2023));
		System.out.println(e);
		
	}
	
	
	

}
