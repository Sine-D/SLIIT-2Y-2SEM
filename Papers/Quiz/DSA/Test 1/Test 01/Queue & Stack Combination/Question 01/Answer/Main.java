package Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Queue queue = new Queue(5);
		Queue finalQueue = new Queue(10);
		Stack stack = new Stack(5);
		
		//get user input - V W X Y Z
		for(int i=0; i<5; i++) {
			System.out.print("Enter character :");
			char c = input.next().charAt(0);
			queue.insert(c);
		}
		
		//push queue  element into stack
		for(int i=0; i<5; i++) {
			char temp = queue.remove();
			stack.push(temp);
			finalQueue.insert(temp);
		}
		
		
		
		//pop stack array element and append to the finalQueue
		for(int i=0; i<5; i++) {
			finalQueue.insert(stack.pop());
		}
		
		//remove finalQueue
		for(int i=0; i<10; i++) {
			System.out.print(finalQueue.remove()+" ");
		}
		
		
		

	}

}
