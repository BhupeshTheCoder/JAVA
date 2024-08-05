package session_09;
public class ThreadGroupDemo {	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main thread
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main group
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system
		
		ThreadGroup g1 = new ThreadGroup("g1");
		Thread t1 = new Thread(g1, "one");
		Thread t2 = new Thread(g1,"two");
		ThreadGroup g2 = new ThreadGroup(g1, "g2");
		System.out.println(g2.getParent().getName());//g1
		System.out.println(t1.getThreadGroup().getName());//g1
		System.out.println(t1.getThreadGroup().getParent().getName());//main
		
		System.out.println("g1 priority : "+g1.getMaxPriority());//10
		System.out.println("t1 priority : "+t1.getPriority());//5
		System.out.println("t2 priority : "+t2.getPriority());//5
		
		g1.setMaxPriority(7);
		System.out.println("t1 priority : "+t1.getPriority());//5
		System.out.println("t2 priority : "+t2.getPriority());//5
		Thread t3 = new Thread(g1,"three");
		System.out.println("t3 priority : "+t3.getPriority());//3
		System.out.println("g1 priority : "+g1.getMaxPriority());//3
		
		
	}

}
