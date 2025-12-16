package LinkList_insert_and_delete;

import java.util.Scanner;
/*
 Q1) Write a main method to create a linked list. Insert three elements into the linked list 
(at the beginning). Then delete two elements from the list and display the list after each 
insertion and deletion. 
 
Sample Output: 
 
Inserted: 7.2 
List: 7.2  
Inserted: 5.5 
List: 5.5 7.2  
Inserted: 9.8 
List: 9.8 5.5 7.2  
Deleted: 9.8 
List: 5.5 7.2  
Deleted: 5.5 
List: 7.2 
 */
 

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkList list = new LinkList();
		
		System.out.print("Inserted :");
		list.inserFirst(input.nextDouble());
		
		System.out.print("List :");
		list.displayList();
		System.out.println();
		
		System.out.print("Inserted :");
		list.inserFirst(input.nextDouble());
		
		System.out.print("List :");
		list.displayList();
		System.out.println();
		
		System.out.print("Inserted :");
		list.inserFirst(input.nextDouble());
		
		System.out.print("List :");
		list.displayList();
		System.out.println();
		
		Link link=list.deleteFirst();
		System.out.print("Deleted :");
		link.dispayLink();
		System.out.println();
		
		System.out.print("List :");
		list.displayList();
		System.out.println();
		
		 link=list.deleteFirst();
		System.out.print("Deleted :");
		link.dispayLink();
		System.out.println();
		
		System.out.print("List :");
		list.displayList();
		System.out.println();
		
		
	}

}
