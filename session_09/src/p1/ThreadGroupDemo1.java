package p1;

public class ThreadGroupDemo1 {
	
	public static void main(String[] args) {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();//system
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1: t)
		{
			System.out.println(t1.getName()+" "+t1.isDaemon());
		}	
	}
}


/*int enumerate(Thread[] t):
	to copy all active threads of this thread group into provided thread array
	
	g.enumerate(t);
	g - threadgroup
	t - thread array
*/	