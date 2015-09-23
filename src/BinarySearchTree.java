// TreeNode that stores Integers
class TreeNode {

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
		if(root == null) {
			// Empty BST
			return false; 
		} else if(root.getData() == searchKey) {										// the root is the item we are looking to delete
			if(root.getLeftChild() == null && root.getRightChild() == null) { 			// root has no children 
				root = null;
				length--;
				return true;
			} else if(root.getLeftChild() == null) {									// root jut has right child
				root = root.getRightChild();
				length--;
				return true;
			} else if(root.getRightChild() == null) { 									// root just has left child
				root = root.getLeftChild();
				length--;
				return true; 
			} else { 																	// has two children, replace root with its successor
				TreeNode successorParent = root.getRightChild();
				if(successorParent.getLeftChild() == null) { 							// the successor is the roots right child
					TreeNode successor = successorParent;
					successor.setLeftChild(root.getLeftChild());
					root = successor;
					length--;
					return true;
				}
				
				// Go down the tree until we have located the successor and its parent
				while(successorParent.getLeftChild().getLeftChild() != null) {
					successorParent = successorParent.getLeftChild();
				}
				TreeNode successor = successorParent.getLeftChild();
				
				successorParent.setLeftChild(successor.getRightChild());				// make sure successors parent points to the correct place

				// Replace the current root with successor 
				successor.setLeftChild(root.getLeftChild());
				successor.setRightChild(root.getRightChild());
				root = successor;
				length--;
				return true;
			}
		} else {																		// the item we are looking to delete is not the root, it is somewhere else in the tree or it doesn't exist at all
			TreeNode current = root; 

			// Find the parent of the child to delete, or potentially find out that data does not exist in the tree and return false
			while((current.getLeftChild() == null || current.getLeftChild().getData() != searchKey) && (current.getRightChild() == null || current.getRightChild().getData() != searchKey)) {
				if(searchKey > current.getData()) {
					if(current.getRightChild() == null) {
						return false; 
					} else {
						current = current.getRightChild();
					}
				} else {
					if(current.getLeftChild() == null) {
						return false; 
					} else {
						current = current.getLeftChild();
					}
				}
			}

			// If the program has reached this point in the code, we know that either its left child or its right child must be 
			// the node that we are looking to delete
			TreeNode parent = current;
			TreeNode child; 
			boolean isRightChild; 
			
			// Figure out if child is on the left or right
			if(searchKey > parent.getData()) {
				child = parent.getRightChild();
				isRightChild = true; 
			} else {
				child = parent.getLeftChild();
				isRightChild = false; 
			}
			
			if(child.getLeftChild() == null && child.getRightChild() == null) {			// child has no children
				return setChild(parent ,null ,isRightChild);
			} else if(child.getLeftChild() == null) {									// child just has a right child 
				return setChild(parent, child.getRightChild(), isRightChild);
			} else if(child.getRightChild() == null) {									// child just has a left child 
				return setChild(parent, child.getLeftChild(), isRightChild);
			} else {																	// has two children, replace child with its successor
				TreeNode successorParent = child.getRightChild();
				if(successorParent.getLeftChild() == null) {							// the successor is the roots right child
					return setChild(parent, child.getRightChild(), isRightChild);
				}
				
				// Go down the tree until we have located the successor and its parent
				while(successorParent.getLeftChild().getLeftChild() != null) {
					successorParent = successorParent.getLeftChild();
				}
				TreeNode successor = successorParent.getLeftChild();
				
				
				successorParent.setLeftChild(successor.getRightChild());				// make sure successors parent points to the correct place

				successor.setLeftChild(child.getLeftChild());
				successor.setRightChild(child.getRightChild());
				return setChild(parent, successor, isRightChild);
			}
		}
	}
	
	// Sets the parents correct child to be replaced by newChild and hence deleted and subtracts from the length of the BST
	// Returns: True
	private boolean setChild(TreeNode parent, TreeNode newChild, boolean isRightChild) {
		if(isRightChild) {
			parent.setRightChild(newChild);
			length--;
			return true;
		} else {
			parent.setLeftChild(newChild);
			length--; 
			return true;
		}
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

	// Find element with smallest data 
	public TreeNode smallest() {
		if(root == null) {
			return null;
		} else {
			TreeNode current = root; 
			while(current.getLeftChild() != null) {
				current = current.getLeftChild();
			}
			return current;
		}
	}

	// Find element with largest data
	public TreeNode largest() {
		if(root == null) {
			return null;
		} else {
			TreeNode current = root; 
			while(current.getRightChild() != null) {
				current = current.getRightChild();
			}
			return current;
		}
	}

	public int getLength(){
		return length; 
	}

}
