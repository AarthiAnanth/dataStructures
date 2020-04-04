package com.stack.implementation;

public class StackArray {
	public static void main(String[] args) {
		Stack s = new Stack(); 
        s.push('1'); 
        s.push('2'); 
        s.push('3'); 
        System.out.println(s.pop() + " Popped from stack"); 	
	}

}

class Stack{
	int top;
	static final int MAX=1000;
	char a[]=new char[MAX];
	
	Stack() {
		top=-1;
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	public boolean isFull() {
		return (top>=(MAX-1));
	}
	public boolean push(char x) {
		if(!isFull()) {
			a[++top]=x;
			System.out.println("pushed to stack"+ x);
			return true;
		}
		else {
			System.out.println("Stack is full");
			return false;
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			return a[top--];
		}else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			return a[top];
		}
	}
}
