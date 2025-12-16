package Reverse_a_String_using_Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a String :");
		String string = input.nextLine();
		
		char stringArr[] = string.toCharArray();
		Stack stack = new Stack(stringArr.length);
		
		for(int i=0; i<stringArr.length; i++) {
			stack.push(stringArr[i]);
		}
		
		System.out.print("Revirse String : ");
		for(int i=0; i<stringArr.length; i++) {
			System.out.print(stack.pop());
		}
		
		
	}
}
