package Q_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Queue to hold input values
	    Queue queue = new Queue(5);

	    // Insert 5 numbers into the queue
	    for (int i = 0; i < 5; i++) {
	        System.out.print("Enter a number: ");
	        queue.insert(input.nextInt());
	    }

	    // Temporary queue to hold sorted values
	    Queue tempQueue = new Queue(5);

	    // Sort elements by moving them from queue to tempQueue
	    while (!queue.isEmpty()) {
	        int current = queue.remove();

	        // Move elements from tempQueue back to queue if they're greater than the current element
	        while (!tempQueue.isEmpty() && current > tempQueue.peekFront()) {
	            queue.insert(tempQueue.remove());
	        }

	        // Insert the current element into its sorted position in tempQueue
	        tempQueue.insert(current);
	    }

	    // Display sorted elements
	    System.out.println("Sorted Queue: ");
	    while (!tempQueue.isEmpty()) {
	        System.out.print(tempQueue.remove() + " ");
	    }
	}


}