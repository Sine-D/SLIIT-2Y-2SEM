package Q1;

public class Stack {
	
	private char array[];
	private int maxSize;
	private int top;
	
	Stack(int size){
		maxSize = size;
		array = new char[maxSize];
		top = -1;
	}
	
	public void push(char c) {
		if(top == maxSize-1) {
			System.out.print("Can't insert, Stack is full");
		}else {
			array[++top] = c;
		}
	}
	
	public char pop() {
		if(top == -1) {
			System.out.print("Can't remove, Stack is empty");
			return (' ');
		}else {
			return array[top--] ;
		}
	}
}
