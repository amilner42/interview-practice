// TreeNode that stores Integers
public class TreeNode {

	private Integer data; 
	private TreeNode leftChild;
	private TreeNode rightChild;

	// Returns: TreeNode with data == searchKey if such a TreeNode exists in the set of tree nodes containing this and all of 
	// this's direct and indirect children. Otherwise returns null
	public TreeNode find(Integer searchKey) {
		if(searchKey.equals(data)) {
			return this;
		} else if(searchKey > data) {
			if(rightChild == null) {
				return null;
			} else {
				return rightChild.find(searchKey);
			}
		} else {
			if(leftChild == null) {
				return null;
			} else {
				return leftChild.find(searchKey);
			}			
		}
	}

	// In order traversal 
	public void inOrderTraversal() {
		if(leftChild != null) { leftChild.inOrderTraversal(); }
		System.out.print("Data: " + data + " ");
		if(rightChild != null) { rightChild.inOrderTraversal();}
	}

	// Pre order traversal
	public void preOrderTraversal() {
		System.out.print("Data: " + data + " ");
		if(leftChild != null) { leftChild.preOrderTraversal(); }
		if(rightChild != null) { rightChild.preOrderTraversal();}
	}

	// Post order traversal
	public void postOrderTraversal() {
		if(leftChild != null) { leftChild.postOrderTraversal(); }
		if(rightChild != null) { rightChild.postOrderTraversal();}
		System.out.print("Data: " + data + " ");
	}

	public TreeNode(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data; 
	}

	public void setData(Integer data) {
		this.data = data; 
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode node) {
		leftChild = node; 
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode node) {
		rightChild = node;
	}

}
