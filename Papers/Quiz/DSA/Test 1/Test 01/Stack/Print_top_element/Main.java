package Print_top_element;

import java.util.Scanner;

/*
 Q2) Write a main method to create a stack with a size of 2. Push three elements into the 
stack to demonstrate a stack overflow. After pushing, print the top element of the stack 
using the peek method. 

Sample Output: 
Pushed: 7.1  
Pushed: 3.3  
Stack is full  
Top element is: 3.3
  
*/

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack(2);
		
		//push
		stack.push(7.1);
		stack.push(3.3);
		stack.push(4.1);
		
		
		//top element
		System.out.println("Top element is :"+stack.peek());
			
	}
}
