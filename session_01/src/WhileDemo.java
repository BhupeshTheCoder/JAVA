
public class WhileDemo {

	public static void main(String[] args) {
		
		int i = 1,sum = 0;
		
		
		while(i<=10)
		{
			//sum = sum + i;
			sum+=i;
			i++;
		}
		
		System.out.println("Sum of 1st 10 Natural Nos = "+sum);
		
	}
	
}

/*while loop:
	
	init;

	while(condn)
	{
		stmts;
		inc/dec;
	}
*/