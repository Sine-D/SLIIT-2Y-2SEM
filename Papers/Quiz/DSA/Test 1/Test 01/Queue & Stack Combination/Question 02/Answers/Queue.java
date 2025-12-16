package q2;

public class Queue {
	private int NoOfItems;
	private int front;
	private int rear;
	private int maxSize;
	private char array[];
	
	Queue(int size){
		maxSize = size;
		array = new char[maxSize];
		rear = -1;
		front = 0;
		NoOfItems = 0;
	}
	
	public void insert(char c) {
		
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			array[++rear] = c;
			NoOfItems ++;
		}
	}
	
	public char remove() {
		
		if(isEnpty()) {
			System.out.println("Queue is empty");
			return (' ');
		}else {
			char temp = array[front];
			if(front == maxSize-1) {
				front = 0;
			}else {
				front++;
			}
			NoOfItems --;
			return temp;
		}	
	}
	
	public boolean isEnpty() {
		
		if(NoOfItems == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		
		if(NoOfItems == maxSize) {
			return true;
		}else {
			return false;
		}
	}

}
