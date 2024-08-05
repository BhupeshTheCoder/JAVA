package session_09;
public class JoinDemo implements Runnable{
	public static void main(String[] args) {
		
		JoinDemo j1 = new JoinDemo();
		Thread t1 = new Thread(j1, "one");
		Thread t2 = new Thread(j1, "two");
		Thread t3 = new Thread(j1,"three");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();	
	}

	@Override
	public void run() {
		for(int i=1;i<=7;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}	
	} 
}
