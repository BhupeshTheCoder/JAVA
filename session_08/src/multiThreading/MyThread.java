package multiThreading;
public class MyThread extends Thread
{
	public void run() {
		
		System.out.println("Thread : "+Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}	
	}
	public static void main(String[] args) {	
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
