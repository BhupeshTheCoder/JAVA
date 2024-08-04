package pack3;

import java.util.Comparator;

public class Employee implements Comparable {

	 int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}


	@Override
	public int compareTo(Object o) {
		int eid1 =this.empId;
		Employee e = (Employee)o;
		int eid2 =e.empId;
		if(eid1<eid2) return -1;
		else if(eid1>eid2) return 1;
		else return 0;
	}
	
	
}
