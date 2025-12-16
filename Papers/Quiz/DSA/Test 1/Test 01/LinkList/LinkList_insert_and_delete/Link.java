package LinkList_insert_and_delete;

public class Link {
	public double data ;
	public Link next;
	
	public Link(double data) {
		this.data = data;
		this.next = null;
	}
	public void dispayLink() {
		System.out.print(this.data+" ");
	}
}
