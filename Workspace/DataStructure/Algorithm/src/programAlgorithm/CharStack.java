package programAlgorithm;

import java.util.Arrays;

public class CharStack {
	private int top;
	private char[] arr;
	
	public CharStack() {
		top = -1;
		arr = new char[5];
	}
    
	public CharStack(int s) {
		top = -1;
		arr = new char[s];
	}
	
	public boolean isFull() {
		if(top == arr.length-1) return true;
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	
	public void push(char d) {
		if(isFull()) {
			System.out.println("\n  Stack is overFlow");
			return;
		}
		top = top + 1;
		arr[top] = d;
		return;	
	}
	
	public char pop() {
		char d = '@';
		if(isEmpty()) {
			System.out.println("\n Stack is underFlow");
		}
		d = arr[top];
		arr[top] = ' ';
		top = top -1;
		return d;
	}
	
	public char peek() {
		char d ='@';
		if(isEmpty()) {
			System.out.println("\n Stack is UnderFlow");
			return d;
		}
		d = arr[top];
		return d;
	}

	@Override
	public String toString() {
		return "CharStack [arr=" + Arrays.toString(arr) + "]";
	}
	
	
}