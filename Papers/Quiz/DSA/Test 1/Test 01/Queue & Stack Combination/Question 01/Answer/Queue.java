package Q1;

public class Queue {
	
	private int noOfItems;
	private int maxSize;
	private int front;
	private int rear;
	private char array[];
	
	Queue(int size){
		maxSize = size;
		array = new char[maxSize];
		front = 0;
		rear = -1;
		noOfItems = 0;
	}
	
	public void insert(char c) {
		if(noOfItems == maxSize) {
			System.out.print("Can't insert, Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			array[++rear] = c;
			noOfItems++;
		}
	}
	
	public char remove() {
		if(noOfItems == 0) {
			System.out.print("Can't remove, Queue is empty");
			return (' ');
		}else {
			char temp = array[front];
			if(front == maxSize) {
				front = 0;
			}else {
				front++;
			}
			noOfItems--;
			return(temp);
		}
	}
	
	
}
