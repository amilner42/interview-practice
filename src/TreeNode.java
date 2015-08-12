// TreeNode that stores Integers
public class TreeNode {

	private Integer data; 
	private TreeNode leftChild;
	private TreeNode rightChild;

	// Returns: TreeNode with data == searchKey if such a TreeNode exists in the set of tree nodes containing this and all of 
	// this's direct and indirect children. Otherwise returns null
	public TreeNode find(Integer searchKey) {
		if(searchKey == data) {
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
