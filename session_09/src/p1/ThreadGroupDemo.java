package p1;
public class ThreadGroupDemo {	
	public static void main(String[] args) {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThread t1 = new MyThread(pg, "ChildThread1");
		MyThread t2 = new MyThread(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println("Active Count = "+pg.activeCount());
		System.out.println("Active Group Count = "+pg.activeGroupCount());
		pg.list();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Active Count = "+pg.activeCount());
		System.out.println("Active Group Count = "+pg.activeGroupCount());	
	}
}
