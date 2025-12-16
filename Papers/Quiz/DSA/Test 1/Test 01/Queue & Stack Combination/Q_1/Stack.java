package Q_1;

public class Stack {
	
	private int top;
	private int maxSize;
	private char charArray[];
	
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.charArray = new char[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(char c) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			charArray[++top] = c;
		}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return ' ';
		}else {
			return charArray[top--];
		}
	}
	

}
