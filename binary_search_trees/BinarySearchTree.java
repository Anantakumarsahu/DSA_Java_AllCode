package binary_search_trees;

public class BinarySearchTree {
	
	private BinarySearchTreeNode root;
	
	public void insert(int value) {
		if(root == null)
			root = new BinarySearchTreeNode(value);
		else
			root.insert(value);
	}
	
	public void traverseInOrder() {
		if(root != null)
			root.traverseInOrder();
	}
	
	public BinarySearchTreeNode get(int value) {
		if (root != null)
			return root.get(value);
		return null;
	}
	
	public int min() {
		if (root == null)
			return Integer.MIN_VALUE;
		else
			return root.min();
	}
	public int max() {
		if (root == null)
			return Integer.MAX_VALUE;
		else
			return root.max();
	}

}
