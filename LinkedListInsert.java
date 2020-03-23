package singlyLinkedList;

import singlyLinkedList.LinkedList.Node;

class LinkedList {
	 Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void insertBegin(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertPosition(int data,int pos) {
		Node temp=head;
		Node newNode=new Node(data);
		while(temp.next!=null) {
			if(temp.data==pos) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			temp=temp.next;
		}
	}
	
	public void insertLast(int data) {
		Node temp=head;
		Node newNode=new Node(data);
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void deleteAtStart() {
		if(head.next==null) {
			head=null;
		}
		else {
			head=head.next;
		}		
	}
	public void deleteAtPosition(int pos) {
		int count=1;
		Node temp=head;
		Node prev=null;
		if(pos==1) {
			deleteAtStart();
		}else {
		boolean flag=false;
		while(temp.next!=null) {
			if(count==pos) {
				flag=true;
				prev.next=temp.next;
			}
			count=count+1;
			prev=temp;
			temp=temp.next;
			}
		if(flag==false) {
			prev.next=null;
		}
		}
	}
	public void deleteAtLast() {
		Node temp=head;
		Node prev=null;
		if(head.next==null) {
			deleteAtStart();
		}else {
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		}
	}
	public void display(){
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class LinkedListInsert{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		System.out.println("--------Insert at begin-------");
		l1.insertBegin(12);
		l1.insertBegin(23);
		l1.insertBegin(90);
		l1.insertBegin(84);
		l1.display();
		System.out.println("--------Insert at Postion------");
		l1.insertPosition(45, 23);
		l1.insertPosition(67, 45);
		l1.display();
		System.out.println("--------Insert at Last-------");
		l1.insertLast(78);
		l1.display();		
		System.out.println("--------Delete at Last-------");
		l1.deleteAtLast();
		l1.display();
		System.out.println("--------Delete at postion-------");
		l1.deleteAtPosition(6);
		l1.display();
		System.out.println("--------Delete at start-------");
		l1.deleteAtStart();
		l1.display();
	}
}
