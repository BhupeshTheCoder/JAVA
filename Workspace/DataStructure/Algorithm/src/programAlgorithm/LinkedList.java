package programAlgorithm;

import java.util.Scanner;

public class LinkedList {
	IntListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertFirst(int d) {
		IntListNode new_node = new IntListNode(d);
		if(head == null) {
			head = new_node;
			return;
		}
	}
	
	public String toString() {
		String str = new String(" ");
		if(head == null) {
			return "List is Empty";
			
		}
		IntListNode itr = head;
		str = "\n list";
		while(itr != null) {
			str = str +"->"+itr.getData();
			itr = itr.getNext();
			
		}
		return str;
	}
	
	public void insertLast(int d) {
		IntListNode new_node = new IntListNode(d);
		if(head == null) {
			head = new_node;
			return;
		}
		IntListNode itr = head;
		while(itr.getNext() != null)
			itr = itr.getNext();
		itr.setNext(new_node);
		return;
	}
	public void insertByPos(int data , int pos) {
		IntListNode new_node = new IntListNode(data);
		if(head == null) {
			head = new_node;
			return;
		}if(pos == 1) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		IntListNode itr = head;
		for(int i = 1; i<pos-1 && itr.getNext() != null; i++) {
			itr = itr.getNext();
		}
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
   public int deleteFirst() {
	   int d = -9;
	   IntListNode deletetable;
	   if(head == null) {
		   return d;
	   }
	   if(head.getNext() == null) {
		   d = head.getData();
		   head = null;
		   return d;
	   }
	   deletetable = null;
	   d = head.getData();
	   head = head.getNext();
	   deletetable = null;
	   return d;
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int ch;
	int data=0, before=0;
	int pos=0;
	LinkedList obj = new LinkedList();
	do {
		System.out.println("1. InsertFirst");
        System.out.println("2. InsertLast");
        System.out.println("3. DeleteFirst");
        System.out.println("4. Display");
        ch=sc.nextInt();
		switch (ch) {
		case 1: 
			System.out.println("Enter values: ");
		    data = sc.nextInt();
		    obj.insertFirst(data);
		    break;
		case 2:
			System.out.println("Enter value: ");
			data = sc.nextInt();
			obj.insertLast(data);
			break;
		case 3:
            data = obj.deleteFirst();
            System.out.println(data +"Deleted");
            break;
		case 4:
//			System.out.println(c);
			break;}
		
	} while (ch != 5);
}
}
