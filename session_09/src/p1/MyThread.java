package p1;

public class MyThread extends Thread{

	public MyThread(ThreadGroup g,String name)
	{
		super(g,name);
	}
	
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
