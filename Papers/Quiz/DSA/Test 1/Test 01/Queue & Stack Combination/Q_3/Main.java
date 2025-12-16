package Q_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		Queue queue = new  Queue(5);
		Stack stack = new Stack(5);
		
		for (int i=0; i<5; i++) {
			System.out.print("Enter a Number :");
			queue.insert(input.nextInt());
		}

		
		while(!queue.isEmpty()) {
			int current  = queue.remove();
			
			while(!stack.isEmpty() && stack.peek()>current) {
				
					queue.insert(stack.pop());
			}
			stack.push(current);
		}
		
		while(!stack.isEmpty()) {
			queue.insert(stack.pop());
		}
		
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		
		System.out.print("Queue after sorting: ");
		while(!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		
	
	
	
	}
}
