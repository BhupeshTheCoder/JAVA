
public class NestedForDemo {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if((i==2) && (j==2))
				{
					//break;
					continue;
				}
				System.out.println(i+" "+j);
			}
			System.out.println();
		}	
	}
}

/*
 * i j 1 1 1 2 1 3 2
 */

/*For every value of outer loop 
inner loop executes completely

for(init; condn; inc/dec)//outer loop
{
	for(init;condn;inc/dec)//inner loop
	{
		stmts;
	}
}*/