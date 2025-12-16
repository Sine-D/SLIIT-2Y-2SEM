package Remove_Dublicates;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkList list = new LinkList();
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter number : ");
			list.inserFirst(input.nextInt());
		}
		
		System.out.print("List: ");
		list.displayList();
		System.out.println();
		
		
		Link current = list.first;
		
		while(current != null) {
			Link runner = current;
			
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		
		System.out.print("List (After remove dublicates): ");
		list.displayList();
		System.out.println();
		

	}

}
