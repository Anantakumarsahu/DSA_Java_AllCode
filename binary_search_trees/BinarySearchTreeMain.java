package binary_search_trees;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		
		BinarySearchTree intTree = new BinarySearchTree();
		
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
		intTree.traverseInOrder();
		System.out.println();
		
		System.out.println(intTree.get(22));
		System.out.println(intTree.get(58));
		
		System.out.println("The min value in the tree is : " + intTree.min());
		System.out.println("The max value in the tree is : " + intTree.max());
		
	}

}
