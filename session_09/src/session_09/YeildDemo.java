package session_09;
public class YeildDemo implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=4;i++)
		{
			if(i == 2)
				Thread.yield();
			else
				System.out.println(i+" Thread Name : "+Thread.currentThread().getName());
				
		}	
	}
	public static void main(String[] args) {	
		Thread t1  = new Thread(new YeildDemo());
		Thread t2  = new Thread(new YeildDemo());
		Thread t3  = new Thread(new YeildDemo());
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
