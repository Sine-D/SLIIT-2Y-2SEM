package Q_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter a String :");
		String string = input.nextLine();
		
		Queue characterQueue = new Queue(string.length());
		Queue tempCharacterQueue = new Queue(string.length());
		Stack charStack = new Stack(string.length());
		
		for(int i=0; i<string.length(); i++) {
			characterQueue.insert(string.charAt(i));
			tempCharacterQueue.insert(string.charAt(i));
		}
		
		for(int i=0; i<string.length(); i++) {
			charStack.push(tempCharacterQueue.remove());
		}
		
		int count = 0;
		for(int i=0; i<string.length(); i++) {
			if(charStack.pop() != characterQueue.remove()) {
				count++;
			}
		}
		
		if(count == 0){
			System.out.print("Palindrome");
		}else {
			System.out.print("Not a Palindrome");
		}
	}

}
