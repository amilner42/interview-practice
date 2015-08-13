
public class BinarySearchTreeDemo {
	
	public static void main(String[]args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		/*	The tree:
		 * 				5
		 * 		1				8
		 * 		  3			  6
		 * 		    4		   7
		 */
		
		System.out.println("\nLength: " + bst.getLength());
		
		bst.insert(new TreeNode(5));
		bst.insert(new TreeNode(8));
		bst.insert(new TreeNode(1));
		bst.insert(new TreeNode(3));
		bst.insert(new TreeNode(4));
		bst.insert(new TreeNode(6));
		bst.insert(new TreeNode(7));
		
		System.out.println(bst.find(8).getData());
		System.out.println(bst.find(20));
		System.out.println(bst.find(3).getData());
		System.out.println(bst.find(1).getData());
		System.out.println(bst.find(5).getData());
		System.out.println(bst.find(6).getData());
		System.out.println(bst.find(7).getData());
		
		System.out.print("\nIn order Traversal: ");
		bst.inOrderTraversal();
		
		System.out.print("\nPre order Traversal: ");
		bst.preOrderTraversal();
		
		System.out.print("\nPost order Traversal: ");
		bst.postOrderTraversal();
		
		System.out.println("\n\nLength: " + bst.getLength());
		System.out.println("Smallest datum: " + bst.smallest().getData());
		System.out.println("Largest datum: " + bst.largest().getData());
		
		
	}
}
