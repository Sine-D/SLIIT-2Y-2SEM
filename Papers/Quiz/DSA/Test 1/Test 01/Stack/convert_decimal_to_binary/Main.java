package convert_decimal_to_binary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter decimal number :");
		int decimalNum = input.nextInt();
		
		Stack binary = new Stack(100);
		
		while(decimalNum != 0) {
			
			if(decimalNum % 2 == 0) {
				binary.push(0);
			} else {
				binary.push(1);
			}
			
			decimalNum /= 2;
		}
		
		while(!binary.isEmpty()) {
			System.out.print(binary.pop() + "");
		}
	}
}
