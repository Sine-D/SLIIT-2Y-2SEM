package Merge_Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Queue queue1 = new Queue(5);
		Queue queue2 = new Queue(5);
		Queue mergeQueue = new Queue(10);
		
		while(!queue1.isFull()) {
			System.out.print("Enter a Number For Queue 01:");
			queue1.insert(input.nextInt());
		}
		
		System.out.println();
		
		while(!queue2.isFull()) {
			System.out.print("Enter a Number For Queue 02:");
			queue2.insert(input.nextInt());
		}
		
		while(!queue2.isEmpty()) {
			mergeQueue.insert(queue1.remove());
			mergeQueue.insert(queue2.remove());
		}
		
		System.out.println("Merge Queue:");
		while(!mergeQueue.isEmpty()) {
			System.out.print(mergeQueue.remove()+" ");
		}
		
		
		
	}

}
