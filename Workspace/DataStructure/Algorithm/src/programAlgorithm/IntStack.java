package programAlgorithm;

import java.util.Arrays;

public class IntStack {
	private int top;
	private int arr[];
	
	public IntStack() {
		top = -1;
		arr = new int[5];
	}
	
	public IntStack(int s) {
		top = -1;
		arr = new int[s];
	}
	
	public boolean isFull() {
		if(top == arr.length - 1) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == 1) return true;
		else return false;
	}
	
	public void push(int d) {
		if(isFull()) {
			System.out.println("\n Stack OverFlow is full");
			return;
		}
		top = top + 1;
		arr[top] = d;
		return;
	}
	
	public int pop() {
		int d = -9;
		if(isEmpty()) {
			System.out.println("\n Stack UnderFlow or Empty");
			return d;
		}
		d = arr[top];
		arr[top] = 0;
		top = top - 1;
		return d;
	}
	
	public int peek() {
		int d = -9;
		if(isEmpty()) {
			System.out.println("\n Stack UnderFlow or Empty");
			return d;
		}
		d = arr[top];
		return d;
	}

	@Override
	public String toString() {
		return "IntStack [arr=" + Arrays.toString(arr) + "]";
	}
    
	
}
