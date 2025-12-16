package q2;

public class Stack {
	private int top;
	private int  maxSize;
	private char array[];
	
	Stack(int size){
		maxSize = size;
		top = -1;
		array = new char[maxSize];
	}
	
	public void push(char c) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			array[++top] = c;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return (' ');
		}else {
			return array[top--];
		}
	}
	
	public boolean isFull() {
		if(top == maxSize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
}
