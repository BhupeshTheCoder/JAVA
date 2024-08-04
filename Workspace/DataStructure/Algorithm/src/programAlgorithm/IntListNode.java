package programAlgorithm;

public class IntListNode {

	private int data;
	private IntListNode next;
	
	public IntListNode() {
		data = 0;
		next = null;
	}
	
	public IntListNode(int d) {
		data = d;
		next = null;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(IntListNode n) {
		next = n;
	}
	
	public IntListNode getNext() {
		return next;
	}
}
