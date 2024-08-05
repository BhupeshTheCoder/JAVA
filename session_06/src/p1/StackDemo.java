package p1;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push("A");
		s.push('B');
		
		System.out.println(s);
		System.out.println(s.empty());//false
		System.out.println(s.peek());
		System.out.println(s.search('A'));//-1
		System.out.println(s.search(10));//4
		s.pop();
		System.out.println(s);
	}	
}
