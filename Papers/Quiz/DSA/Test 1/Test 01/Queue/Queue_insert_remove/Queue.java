package Queue_insert_remove;

public class Queue {
	
	private int front;
	private int rear;
	private int nOfItems;
	private int maxSize;
	private double doubleArray[];
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		doubleArray = new double[maxSize];
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
	
	public double peekFront() {
		return doubleArray[front];
	}
	
	public void insert(double c) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			nOfItems++;
			doubleArray[++rear] = c;
		}
	}
	
	public double remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			
			double temp = doubleArray[front++];
			if(front == maxSize) {
				front = 0;
			}
			nOfItems--;
			return temp;
			
		}
	}

}
