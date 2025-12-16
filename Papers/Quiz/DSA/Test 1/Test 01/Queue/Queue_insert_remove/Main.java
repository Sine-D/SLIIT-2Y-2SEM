package Queue_insert_remove;

import java.util.Scanner;

/*
 Q1) Write a main method to create a queue with a size of 3. Insert three elements into 
the queue and then remove all of them. Print the elements as they are inserted and 
removed. 
 
Sample Output: 
Inserted: 3.1 
Inserted: 5.7 
Inserted: 9.8 
Removed: 3.1 
Removed: 5.7 
Removed: 9.8
 */

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Queue queue = new Queue(3);
	    
	    while(!queue.isFull()) {
	    	System.out.print("Inserted :");
	    	queue.insert(input.nextDouble());
	    }
	    
	    while(!queue.isEmpty()) {
	    	System.out.println("Removed :"+queue.remove());
	    }
	    
	   
	}


}