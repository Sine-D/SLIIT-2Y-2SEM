package Stack_input_output;

import java.util.Scanner;

/*
 Q1) Write a main method to create a stack with a size of 3. Push three elements into the 
stack and pop all of them. Print the elements as they are pushed and popped. 
Sample Output: 

Pushed: 5.5  
Pushed: 8.8  
Pushed: 2.2  
Popped: 2.2  
Popped: 8.8  
Popped: 5.5
  
*/

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack(3);
		
		//push
		while(!stack.isFull()) {
			System.out.print("Pushed :");
			stack.push(input.nextDouble());
			
		}
		
		//pop
		while(!stack.isEmpty()) {
			System.out.println("Popped :"+stack.pop());
			
		}	
	}
}
