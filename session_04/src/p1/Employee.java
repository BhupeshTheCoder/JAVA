package p1;
public class Employee extends Object {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj)//Object obj = new Employee();
	{
		Employee e =(Employee)obj;
		if((this.id == e.id) && (this.name.equals(e.name)))
		return true;
		else
			return false;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id+2;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(111, "Rahul");
		Employee e2 = new Employee(112, "Rahul");
		
		if(e1.equals(e2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}

		System.out.println("e1 = "+e1.hashCode());
		System.out.println("e2 = "+e2.hashCode());
		
		
	}

}
