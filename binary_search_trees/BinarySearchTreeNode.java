package binary_search_trees;

public class BinarySearchTreeNode {

	private int data;
	private BinarySearchTreeNode leftChild;
	private BinarySearchTreeNode rightChild;
	
	public BinarySearchTreeNode(int data) {
		this.data = data;
	}
	
	//To Insert the value/data in the Binary search tree.....
	public void insert(int value) {
		if (value == data)
			return;
		if (value < data) {
			if (leftChild == null)
				leftChild = new BinarySearchTreeNode(value);
			else 
				leftChild.insert(value);
		}
		else {
			if(rightChild == null)
				rightChild = new BinarySearchTreeNode(value);
			else
				rightChild.insert(value);
		}
	}
	
	//To get the value in a tree or to find a value in a tree........
		public BinarySearchTreeNode get(int value) {
			if(value == data)
				return this;
			if(value < data) {
				if(leftChild != null)
					return leftChild.get(value);
			}
			else {
				if (rightChild != null)
					return rightChild.get(value);
			}
			return null;
		}
		
		//To find the minimum value/node of a Binary search tree.....
		public int min() {
			if(leftChild == null)
				return data;
			else
				return leftChild.min();
		}
		
		//To find the minimum value/node of a Binary search tree.....
		public int max() {
			if(rightChild == null)
				return data;
			else
				return rightChild.max();
				}
	
	//To Traverse the Binary search tree in Inorder Form....
	public void traverseInOrder() {
		if(leftChild != null)
			leftChild.traverseInOrder();
		System.out.print(data + ",");
		if(rightChild != null)
			rightChild.traverseInOrder();
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinarySearchTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BinarySearchTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public BinarySearchTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BinarySearchTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
}
