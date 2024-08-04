package programAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class IntQueue {
	int front,rear;
	int arr[];
	
	public IntQueue() {
		front = rear = -1;
		arr = new int[5];
	}
	public IntQueue(int d) {
		front = rear = -1;
		arr = new int[d];
	}
	public boolean isFull() {
		if(rear == arr.length-1) return true;
		else return false;
	}
	public boolean isEmpty() {
		if((front == -1) || (front == rear+1)) return true;
		else return false;
	}
	public void insert(int d) {
		if(isFull()) {
			System.out.println("Satck Overflow");
			return;
		}
		if(front == -1) 
			front = 0;
		    rear = rear+1;
		    arr[rear] = d;
		    return;
	}
	public int delete() {
		int d = -9;
		if(isEmpty()) {
			System.out.println("Empty Stack");
			return d;
		}
		d = arr[front];
		front = front + 1;
		return d;
	}
	public int peek() {
		int d = -9;
		if(isEmpty()) {
			return d;
		}
		   d = arr[front];
		   return d;
	}
	
	@Override
	public String toString() {
		return "IntQueue [arr=" + Arrays.toString(arr) + "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data; 
		char ch;
		System.out.println("Enter Size of IntQueue: ");
		int size = sc.nextInt();
		IntQueue st = new IntQueue(size);
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Deleted");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			
			ch = sc.next().charAt(0);
			switch(ch) {
			case '1': System.out.println("Enter Values: ");
			          data = sc.nextInt();
			          st.insert(data);
			          break;
			case '2': 
	                  data = st.delete();
	                  if(data != '@')
	                  System.out.println(data + "Deleted");	  
	                  break;
			case '3':
				      data = st.peek();
				      if(data != '@')
				      System.out.println(data+"peek");
				      break;
			case '4': 
				      System.out.println(st);
				      break;
			case '5': 
				      break;
				      default:
				      System.out.println("Enter Valid Choice: ");	  
			}
		} while (ch != 5);
	}
}
