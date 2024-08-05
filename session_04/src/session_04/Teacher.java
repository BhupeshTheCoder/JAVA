package session_04;

public class Teacher extends Person{

	private String subject;
	private int yrs_of_exp;
	
	public void getData()
	{
		super.getData();
		{
			System.out.println("Enter subject : ");
			subject = s.next();
			System.out.println("Enter years of Experience : ");
			yrs_of_exp = s.nextInt();
		}
	}
	
	public void showData()
	{
		super.showData();
		{
			System.out.println(subject+" "+yrs_of_exp);
		}
	}
	
}
