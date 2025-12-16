package Tree_Insert_Remove_Find;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Tree tree = new Tree();
		
		
		for(int i=0; i<6; i++) {
			System.out.print("Inserted :");
			tree.Insert(input.nextDouble());
		}
		
		Node node = tree.find(7.0);
		System.out.print("Serching for 7.0 :");
		if(node == null) {
			System.out.print("Not Found");
		}else {
			System.out.print("Found");
		}
		System.out.println();
		
		
		
		System.out.print("In-Order Travels :");
		tree.inOrder();
		

	}

}
