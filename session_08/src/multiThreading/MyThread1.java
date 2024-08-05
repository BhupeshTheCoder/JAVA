package multiThreading;

public class MyThread1 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		MyThread1 m2 = new MyThread1();
		Thread t2 = new Thread(m2);
		MyThread1 m3 = new MyThread1();
		Thread t3 = new Thread(m3);
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(3);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
