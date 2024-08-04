package programAlgorithm;

import java.util.Scanner;

public class AssignLinkList{
	// TODO Auto-generated constructor stub
    IntListNode head;
    
    public AssignLinkList() {
    	head = null;
    }
    
    public IntListNode getHead() {
    	return head;
    }
    
    public void setHead(IntListNode head) {
		this.head = head;
	}

	public void insertFirst(int d) {
		IntListNode new_node = new IntListNode(d);
		if(head == null) {
			head = new_node;
		}else {
	        new_node.setNext(head);
	        head = new_node;
	        return;
	    }
	}
	
	public void insertLast(int d) {
		IntListNode new_node = new IntListNode(d);
		if(head == null) {
			head = new_node;
			return;
		}
		IntListNode itr = head;
		while(itr.getNext()!=null) {
			itr=itr.getNext();
		}
		itr.setNext(new_node);
		return;
	}
	
	private void deleteByAddress(IntListNode d) {
		if (d == null || d.getNext() == null) return;
		IntListNode ild = d.getNext().getNext();
		d.setData(d.getNext().getData());
		d.getNext().setNext(null);
		d.setNext(ild);
		
	}
	
//	public void deleteAltNode() {
//	    if(head == null) {
//	    	System.out.println("Lsit Is Emty");
//	    	return;
//	    }
//	    IntListNode itr = head;
//	    System.out.println("Deleted Alternate Node :");
//	    while (itr != null && itr.getNext() != null) {
//	    	System.out.print(" -> "+itr.getData());
//            deleteByAddress(itr);
//            if (itr.getNext() != null)
//				itr = itr.getNext().getNext();
//			else
//				itr = itr.getNext();
//        } 	
// 	    System.out.println();
//	}
	
	public void deleteAltNode() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print( "Alternate deleted value ");
		while (iter != null) {
			deleteByAddress(iter);
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
		System.out.println();
	}
	
	
	
	public void display_alternativeNode() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print( "Alternate List ");
		while (iter != null) {
			System.out.print(" -> "+iter.getData());
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
		System.out.println();
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
	
	public void reverseList() {
		IntListNode prev,next,iter;
		iter = head;
		prev= null;
		
		while(iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}
		head= prev;
	}
	
	public static IntListNode reverse(IntListNode itr) {
		IntListNode temp;
		if(itr.getNext() == null)
			return itr;
		
		temp = reverse(itr.getNext());
		itr.getNext().getNext();
		itr.setNext(temp);
		return temp;
	}
	
	public void displayReverse() {
		displayReverseRec(head);
	}
	
	private void displayReverseRec(IntListNode itr) {
		if(itr == null) return;
		displayReverseRec(itr.getNext());
		System.out.println("->"+itr.getData());
	}
	
	public static AssignLinkList mergeSort(AssignLinkList list1, AssignLinkList list2) {
		AssignLinkList all = new AssignLinkList();
		IntListNode itr1 = list1.getHead();
		IntListNode itr2 = list2.getHead();
		
		while(itr1!=null && itr2!=null) 
			if(itr1.getData() < itr2.getData()) {
				all.insertLast(itr1.getData());
			    itr1=itr1.getNext();
			}else if(itr1.getData() > itr1.getData()){
				all.insertLast(itr2.getData());
				itr2=itr2.getNext();
			}else {
				all.insertLast(itr2.getData());
				itr2=itr2.getNext();
				itr1=itr1.getNext();
			}
		
		while(itr1!=null) {
			all.insertLast(itr1.getData());
			itr1=itr1.getNext();
		}
		while(itr2!=null) {
			all.insertLast(itr2.getData());
			itr2=itr2.getNext();
		}
		return all;
	}
	
	public void evenOdd() {
		AssignLinkList t = new AssignLinkList();
		IntListNode itr = head;
		while(itr!=null) {
			if((itr.getData()%2) == 0) {
				t.insertLast(itr.getData());
			}
			itr = itr.getNext();
		}
		itr=head;
		while(itr!=null) {
			if((itr.getData()%2)!= 0) {
				t.insertLast(itr.getData());
			}
			itr = itr.getNext();
		}
		head = t.getHead();
		t = null;
		return;
	}
	
//	public AssignLinkList evenoddd() {
//		IntListNode itr = head;
//		AssignLinkList t = new AssignLinkList();
//		while(itr!= null) {
//			if((itr.getData()%2)==0) {
//				t.insertLast(itr.getData());
//				itr = itr.getNext();
//			}else {
//				t.insertLast(itr.getData());
//				itr=itr.getNext();
//			}
//		}
//		return t;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignLinkList as = new AssignLinkList();
		AssignLinkList list = new AssignLinkList();
		Scanner sc = new Scanner(System.in);
		int ch;
		int data;
		do {
			System.out.println("1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Delete Alternate Node");
			System.out.println("4. Display");
			System.out.println("5. Display Alt node");
			
			System.out.println("6. Reverse The List");
			System.out.println("8. Reverse By Recursion");
			System.out.println();
			System.out.println();
			System.out.println("9. Even Odd");
			System.out.println("10. Exit");
			System.out.println("Enter Your Choice: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1: 
				System.out.println("Enter The values: ");
				data = sc.nextInt();
				as.insertFirst(data);
				break;
			case 2: 
				System.out.println("Enter The values: ");
				data = sc.nextInt();
				as.insertLast(data);
				break;
			case 3: 
				as.deleteAltNode();
				break;
			case 4: 
				System.out.println(as);
				break;
			case 5: 
				as.display_alternativeNode();
				break;	
			case 6: 
				as.reverseList();
				System.out.println("Done");
				break;
			case 7: 
				as.displayReverse();
				break;
			case 8: 
				AssignLinkList t = AssignLinkList.mergeSort(as, list);
				System.out.println(t);
				break;	
			case 9:
				as.evenOdd();
//				AssignLinkList i =as.evenoddd();
//				System.out.println(i);
				break;	
			case 10: 
				break;
			default:
				System.out.println("Enter Correct choice: ");
			}	
		} while (ch!=11);
		

	}

}
