public class Employee {
	
	public int id;
	public String name;
	public float sal;
	
	public Employee()
	{
		id = 111;
		name = "rahul";
		sal = 12990.89f;
	}
	
	public Employee(int i)
	{
		id = i;
	}

	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public int getId(int a)
	{
		return id;
	}
	
	public String getName(String nm)
	{
		return name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}

}
