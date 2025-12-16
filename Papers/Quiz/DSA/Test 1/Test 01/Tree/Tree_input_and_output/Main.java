package Tree_input_and_output;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Tree tree = new Tree();
		
		
		for(int i=0; i<5; i++) {
			System.out.print("Inserted :");
			tree.Insert(input.nextDouble());
		}
		
		tree.inOrder();
		

	}

}
