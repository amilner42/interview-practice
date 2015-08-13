// BST that holds Integers
public class BinarySearchTree {

	private TreeNode root; 
	private int length;
	
	// to init tree with no root
	public BinarySearchTree() {}
	
	// to init tree with root
	public BinarySearchTree(Integer data) {
		root = new TreeNode(data);
		length++;
	}

	// Returns: TreeNode with data == searchKey if that TreeNode exists in this BST, otherwise returns null
	public TreeNode find(Integer searchKey) {
		return root.find(searchKey);
	}

	// Inserts insertNode into the BST in the appropriate spot
	public void insert(TreeNode insertNode) {
		if(root == null) {
			root = insertNode; 
			length++;
			return;
		}

		TreeNode currentNode = root; 

		while(true) {
			if(insertNode.getData() >= currentNode.getData()) {
				if(currentNode.getRightChild() == null) {
					currentNode.setRightChild(insertNode);
					length++;
					return;
				} else {
					currentNode = currentNode.getRightChild();
				}
			} else {
				if(currentNode.getLeftChild() == null) {
					currentNode.setLeftChild(insertNode);
					length++;
					return;
				} else {
					currentNode = currentNode.getLeftChild();
				}
			}
		}
	}

	// Returns: True if the item was deleted from the list, false if the item was not in the list
	public boolean delete(Integer searchKey) {
		// TODO 
		return true;
	}

	// In order traversal 
	public void inOrderTraversal() {
		if(root != null) {
			root.inOrderTraversal();
		}
	}

	// Pre order traversal
	public void preOrderTraversal() {
		if(root != null) {
			root.preOrderTraversal();
		}
	}
		

	// Post order traversal
	public void postOrderTraversal() {
		if(root != null) {
			root.postOrderTraversal();
		}
	}	

	public int getLength(){
		return length; 
	}

}
