package Tree_input_and_output;

public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public Node find(double key) {
		Node current = root;
		
		while(current != null) {
			if(key<current.ddata) {
				current = current.leftNode;
			}else {
				current = current.rightNode;
			}
			
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	
	public void Insert(double data) {
		Node newNode = new Node();
		newNode.ddata = data;
		
		if(root == null) {
			root = newNode;
		}else {
			Node current = root;
			Node perent;
			
			while(true) {
				perent = current;
				
				if(data<current.ddata) {
					current = current.leftNode;
					
					if(current == null) {
						perent.leftNode = newNode;
						return;
					}
				}else {
					current = current.rightNode;
					
					if(current == null) {
						perent.rightNode = newNode;
						return;
					}
				}
			}
			
		}
		
	}
	
	private void inOrderTravel(Node localRoot) {
		if(localRoot != null) {
			inOrderTravel(localRoot.leftNode);
			localRoot.displayNode();
			inOrderTravel(localRoot.rightNode);
		}
	}
	public void inOrder() {
		inOrderTravel(root);
	}

}
