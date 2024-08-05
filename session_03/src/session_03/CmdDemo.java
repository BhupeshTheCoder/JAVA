package session_03;

public class CmdDemo {
	
	public static void main(String[] args) {
		
		
		if(args.length == 3)
		{
			long p = Long.parseLong(args[0]);
			int n = Integer.parseInt(args[1]);
			float r = Float.parseFloat(args[2]);
			double si =(double) (p*n*r)/100;
			System.out.println("SI = "+si);
		}
		else
		{
			System.out.println("InSufficient Arguments");
		}
		
	}
}


//12000 4 4.5