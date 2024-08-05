import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	public Employee()
	{
		System.out.println("Default Constructor");
		id = 111;
		name = "Rahul";
		salary = 12000.89f;
	}
	
	public Employee(int i,String n, float s)
	{
		System.out.println("Parameterized Constructor Invoked");
		id = i;
		name = n;
		salary = s;
	}
	
	/*
	 * public void display() {
	 * System.out.println("Employee = "+id+" "+name+" "+salary); }
	 */
	
	/*
	 * public String toString() { return "Employee = "+id+" "+name+" "+salary; }
	 */
	
	
	public String toString() // String representation of an Object
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		//e1.display();
		System.out.println(e1);
		Employee e2 = new Employee(222,"Aishwarya",32453.67f);
		//e2.display();
		System.out.println(e2);
	}

	
}
