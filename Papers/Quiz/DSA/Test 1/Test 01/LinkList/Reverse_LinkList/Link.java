package Reverse_LinkList;

public class Link {
	public int data;
	public Link next;
	
	public Link(int data) {
		this.data = data;
		this.next = null;
	}
	public void dispayLink() {
		System.out.print(this.data+" ");
	}
}
