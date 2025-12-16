package find_Min_in_Queue;

public class Queue {
	
	private int front;
	private int rear;
	private int nOfItems;
	private int maxSize;
	private int intArray[];
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		intArray = new int[maxSize];
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
	
	public int peekFront() {
		return intArray[front];
	}
	
	public void insert(int c) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			nOfItems++;
			intArray[++rear] = c;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			
			int temp = intArray[front++];
			if(front == maxSize) {
				front = 0;
			}
			nOfItems--;
			return temp;
			
		}
	}

}
