package Tree_input_and_output;

public class Node {
	
	public double ddata;
	public Node leftNode;
	public Node rightNode;
	
	public Node() {
		leftNode =null;
		rightNode = null;	
	}
	
	public void displayNode() {
		System.out.print(this.ddata+" ");
	}
	
	

}
