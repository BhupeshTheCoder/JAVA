
public class ForDemo {
	public static void main(String[] args) {
		
		for(int i=1;i<11;i++)
		{
			/*if(i%2 == 0)
			{
			System.out.println(i);
			}*/
			
			/*if(i == 5)
			{
				break;
			}*/
			
			
			if(i%5 == 0)
			{
				continue;
			}
			System.out.println(i);
		}	
	}
}


/*
 * for(init;condition;inc/dec)
 *  { 
 *  //stmts; 
 *  }
 */

/*
 * i = 1 1<=11 i =2 2< 11
 */
