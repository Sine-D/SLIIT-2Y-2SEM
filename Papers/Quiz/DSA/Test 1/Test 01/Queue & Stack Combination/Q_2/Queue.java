package Q_2;

public class Queue {
	
	private int front;
	private int rear;
	private int nOfItems;
	private int maxSize;
	private char charArray[];
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		charArray = new char[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nOfItems = 0;
	}
	
	public boolean isEmpty() {
		return nOfItems == 0;
	}
	
	public boolean isFull() {
		return nOfItems == maxSize; 
	}
	
	public void insert(char c) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			nOfItems++;
			charArray[++rear] = c;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return ' ';
		}else {
			
			char temp = charArray[front++];
			if(front == maxSize) {
				front = 0;
			}
			nOfItems--;
			return temp;
			
		}
	}

}
