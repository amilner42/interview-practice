
public class BinarySearchTreeDemo {
	
	public static void main(String[]args) {
		BinarySearchTree bst = new BinarySearchTree(5);
		
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
		
	}
}
