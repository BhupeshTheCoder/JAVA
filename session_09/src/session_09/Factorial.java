package session_09;

public class Factorial {
	
	public synchronized void fact(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
			System.out.println("Fa	ct of "+n+" is "+fact);
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
