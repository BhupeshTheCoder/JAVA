package session_10;
public class Test {	
	public static void main(String[] args) {	
		Runnable r = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1;i<=10;i++)
				{
					sum+=i;
				}
				System.out.println("Traditional "+sum);
			}
		};
		new Thread(r).start();
		
		Runnable r1 = () -> {
		
			int sum = 0;
			for(int i=1;i<=10;i++)
			{
				sum+=i;
			}
			System.out.println("Lambda "+sum);	
		};
		new Thread(r1).start();
	}
}
