package singlyLinkedList;

import singlyLinkedList.LinkedList.Node;

public class CycleLinkedList {
	public static void connectHeadTail(Node head) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head.next.next.next;
	}
	public static int detectCycle(Node head) {
		Node slowPoint=head.next;
		Node fastPoint=head.next;
		while(fastPoint!=null && slowPoint!=null) {
			fastPoint=fastPoint.next;
			if(fastPoint==slowPoint) {
				break;
			}
			if(fastPoint.next==null) {
				return 0;
			}
			fastPoint=fastPoint.next;
			if(fastPoint==slowPoint) {
				break;
			}
			slowPoint=slowPoint.next;
		}
		System.out.println(fastPoint.data+" "+slowPoint.data);
		int count=0;
		fastPoint=fastPoint.next;
		while(fastPoint!=slowPoint) {
			count++;
			fastPoint=fastPoint.next;
		}
		return count;
	}
	public static int cycleStart(Node head) {
		Node slowPoint=head.next;
		Node fastPoint=head.next;
		while(fastPoint!=null && slowPoint!=null) {
			fastPoint=fastPoint.next;
			if(fastPoint==slowPoint) {
				break;
			}
			if(fastPoint.next==null) {
				return 0;
			}
			fastPoint=fastPoint.next;
			if(fastPoint==slowPoint) {
				break;
			}
			slowPoint=slowPoint.next;
		}
		System.out.println(fastPoint.data+" "+slowPoint.data);
		slowPoint=head;
		fastPoint=fastPoint.next;
		while(slowPoint!=fastPoint) {
			slowPoint=slowPoint.next;
			fastPoint=fastPoint.next;
		}
		return slowPoint.data;
		
	}
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertBegin(12);
		l1.insertBegin(23);
		l1.insertBegin(34);
		l1.insertBegin(45);
		l1.insertBegin(56);
		l1.insertBegin(67);
		l1.insertBegin(78);
		l1.insertBegin(89);
		l1.display();
		connectHeadTail(l1.head);	
		//System.out.println(detectCycle(l1.head));
		
		System.out.println(cycleStart(l1.head));
	}
}
