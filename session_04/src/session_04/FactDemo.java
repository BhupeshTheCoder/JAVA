package session_04;

public class FactDemo {
	
	public int fact(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}

}
