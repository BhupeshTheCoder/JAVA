package session_07;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		System.out.println(q.peek());//null
		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		q.poll();
		System.out.println(q);
		//insertion order not preserved based on Some priority
	}

}
