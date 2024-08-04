package first;

public class Employee {
	
	private static int empNo;
	private float salaray;
	private static double totalSalary;
	public Employee(float salaray) {
		super();
		this.salaray = salaray;
	}
	public static int getEmpNo() {
		return empNo;
	}
	public float getSalaray() {
		return salaray;
	}
	public static double getTotalSalary() {
		return totalSalary;
	}
	@Override
	public String toString() {
		return "Employee [\n Employees No: "+empNo + " salaray=" + salaray + "]";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(40000);
		System.out.println(e);
		Employee e1 = new Employee(50000);
		System.out.println(e1);
		Employee e2 = new Employee(60000);
		System.out.println(e2);
		Float total = e+e1+e2;
		System.out.println("\n Total No of Employee: "+Employee.getEmpNo()+"\n Total salary: "+Employee.getTotalSalary());
		
	}
	

}