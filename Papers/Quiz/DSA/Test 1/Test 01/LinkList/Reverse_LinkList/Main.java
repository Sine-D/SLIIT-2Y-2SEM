package Reverse_LinkList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkList list = new LinkList();
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter number : ");
			list.inserFirst(input.nextInt());
		}
		
		list.displayList();

	}

}
