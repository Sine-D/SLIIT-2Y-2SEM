package Q_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		Queue characterQueue = new Queue(4);
		Stack charStack = new Stack(4);
		
		//get user input
		for(int i=0; i<4; i++) {
			System.out.print("Enter character :");
			characterQueue.insert(input.next().charAt(0));
		}
		
		
		for(int i=0; i<4; i++) {
			charStack.push(characterQueue.remove());
		}
		
		for(int i=0; i<4; i++) {
			characterQueue.insert(charStack.pop());
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(characterQueue.remove()+" ");
		}
	}

}
