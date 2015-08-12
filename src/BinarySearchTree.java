// BST that holds Integers
public class BinarySearchTree {

	private TreeNode root; 
	
	// to init tree with no root
	public BinarySearchTree() {}
	
	// to init tree with root
	public BinarySearchTree(Integer data) {
		root = new TreeNode(data);
	}

	// Returns: TreeNode with data == searchKey if that TreeNode exists in this BST, otherwise returns null
	public TreeNode find(Integer searchKey) {
		return root.find(searchKey);
	}

	// Inserts insertNode into the BST in the appropriate spot
	public void insert(TreeNode insertNode) {
		if(root == null) {
			root = insertNode; 
			return;
		}

		TreeNode currentNode = root; 

		while(true) {
			if(insertNode.getData() >= currentNode.getData()) {
				if(currentNode.getRightChild() == null) {
					currentNode.setRightChild(insertNode);
					return;
				} else {
					currentNode = currentNode.getRightChild();
				}
			} else {
				if(currentNode.getLeftChild() == null) {
					currentNode.setLeftChild(insertNode);
					return;
				} else {
					currentNode = currentNode.getLeftChild();
				}
			}
		}
	}

}
