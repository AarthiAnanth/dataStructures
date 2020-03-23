package singlyLinkedList;

import singlyLinkedList.LinkedList.Node;

public class SearchAtPositionFromLast {

	public static void fromLastBruteForce(Node head,int searchNode) {
		int count=1;
		Node temp=head;
		while(temp.next!=null) {
			count++;
			temp=temp.next;
		}
		count=count-searchNode;
		temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			count--;
			if(count==0) {
				System.out.println(temp.data);
			}
		}
	}
	public static void fromLastPointerApproach(Node head, int searchNode) {
		Node p1=head;
		Node p2=head;
		int count=1;
		while(count!=searchNode) {
			count++;
			p2=p2.next;
		}
		while(p2.next!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		System.out.println(p1.data);
		
	}
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertBegin(23);
		l1.insertBegin(56);
		l1.insertBegin(34);
		l1.insertBegin(45);
		l1.insertBegin(67);
		l1.insertBegin(78);
		l1.insertBegin(89);
		l1.insertBegin(90);
		l1.display();
		System.out.println("-----Search from last in bruteforce approach----");
		fromLastBruteForce(l1.head,3);
		fromLastBruteForce(l1.head,5);
		fromLastBruteForce(l1.head,1);
		fromLastBruteForce(l1.head,7);
		System.out.println("-----Search from last in PointerApproach----");
		fromLastPointerApproach(l1.head,3);
		
	}
}
