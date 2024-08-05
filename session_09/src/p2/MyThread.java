package p2;
import java.util.concurrent.locks.ReentrantLock;
public class MyThread extends Thread{	
	static ReentrantLock l = new ReentrantLock();
	
	public MyThread(String name) {
		super(name);
	}

	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+" Got Lock and Performing Operation");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" Performing Alternate Task");
		}
	}
	public static void main(String[] args) {	
		MyThread t1 = new MyThread("one");
		MyThread t2 = new MyThread("two");
		MyThread t3 = new MyThread("three");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
