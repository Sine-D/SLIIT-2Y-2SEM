package sort_accending_order_in_queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		Queue queue = new Queue(5);
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter a number : ");
			queue.insert(input.nextInt());
		}

		Queue tempQueue = new Queue(5);
		while(!queue.isEmpty()) {
			int current = queue.remove();
			
			while(!tempQueue.isEmpty() && current < tempQueue.peekFront()) {
				 queue.insert(tempQueue.remove());
			}
			tempQueue.insert(current);
			
		}
		
		System.out.println("Sorted Queue : ");
		while(!tempQueue.isEmpty()) {
			System.out.print(tempQueue.remove()+" ");
		}
		
		
		
		
	}

}
