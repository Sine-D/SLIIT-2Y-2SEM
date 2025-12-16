package find_Min_in_Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		Queue queue = new Queue(5);
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter a number : ");
			queue.insert(input.nextInt());
			
		}

		int min = queue.peekFront();
		
		while(!queue.isEmpty()) {
			int current = queue.remove();
			
			if(current < min) {
				min = current;
			}
		}
		
		System.out.print("Minimum value : "+min);
		
		
	}

}
