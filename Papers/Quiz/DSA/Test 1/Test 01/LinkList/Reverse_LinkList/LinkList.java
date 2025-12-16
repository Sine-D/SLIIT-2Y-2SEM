package Reverse_LinkList;

public class LinkList {
	private Link first;
	
	public LinkList() {
		this.first = null;
	}
	
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.dispayLink();
			current = current.next;
		}
	}
	
	public boolean find(int key) {
		
		Link current = first;
		
		while(current != null) {
			if(current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void inserFirst(int data) {
		Link link = new Link(data);
		link.next = first;
		first = link;
	}
	
	public boolean insertAfter(int key, int data) {
		Link current = first;
		Link link = new Link(data);
		
		while(current != null) {
			if(current.data == key) {
				link.next = current.next;
				current.next = link;
				
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean delete(int key) {
		Link current = first;
		Link previous = first;
		while(current != null) {
			if(current.data == key) {
				previous.next = current.next;
				
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

}
