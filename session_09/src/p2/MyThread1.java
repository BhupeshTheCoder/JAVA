package p2;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class MyThread1 extends Thread{
	
	//static HashMap m = new HashMap();
	static ConcurrentHashMap m = new ConcurrentHashMap();
	
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating Map");
		m.put(106,"C");
	}
	
	public static void main(String[] args) throws InterruptedException
	{	m.put(101, "A");
		m.put(102, "B");
		MyThread1 t = new MyThread1();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			System.out.println("Main thread iterating and Current Thread is :"+i+" "+m.get(i));
			Thread.sleep(3000);
		}	
	}
}
