package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Queue queue = new Queue(5);
		Stack stack = new Stack(5);
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter character : ");
			queue.insert(input.next().charAt(0));
		}
		
		for(int i=0; i<5; i++) {
			stack.push(queue.remove());
		}
		
		for(int i=0; i<5; i++) {
			queue.insert(stack.pop());
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(queue.remove()+" ");
		}
		
	}

}
