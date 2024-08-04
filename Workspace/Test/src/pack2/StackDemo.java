package pack2;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(60);
		s.push(20);
		s.push('a');
		s.push('b');
		
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());
	    System.out.println(s.search(20));
	    s.pop();
	    System.out.println(s);
	    s.pop();
	    System.out.println(s);
		
		
		
		
		
	}
}
