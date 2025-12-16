package Print_top_element;

public class Stack {
	
	private int top;
	private int maxSize;
	private double doubelArray[];
	
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.doubelArray = new double[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public double peek() {
		return doubelArray[top];
	}
	
	public void push(double c) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			doubelArray[++top] = c;
		}
	}
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return doubelArray[top--];
		}
	}
	

}
