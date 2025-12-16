package Find_Max;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkList list = new LinkList();
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter number : ");
			int num = input.nextInt();
			list.insertFirst(num);
		}
		
		System.out.print("List: ");
		list.displayList();
		System.out.println();
		
		Link current = list.first;
		int max =0;
		while(current != null) {
			
			if(max < current.data) {
				max = current.data;
			}
			
			current = current.next;
		}
		
		System.out.print("Maximum value is : "+max);
		

	}

}
