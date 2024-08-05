package session_09;

public class MyThread2 extends Thread{
	
	Factorial f;

	public MyThread2(Factorial f) {
		super();
		this.f = f;
	}
	
	public void run()
	{
		f.fact(8);
	}

}
