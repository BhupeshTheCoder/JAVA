
public class Employee {

	private int empId;
	private String empName;
	private float empSalary;
	
	//default constructor
	
	public Employee() {
		empId = 11;
		empName = "ABC";
		empSalary = 45000;
	}
	
	public Employee (int i, String s, float f) {
		empId = i;
		empName = s;
		empSalary = f;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(22, "XYZ", 55000);
		System.out.println(e1);
		
	}
	
}
