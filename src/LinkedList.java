
public class LinkedList<Type> {
	
	private Node<Type> head; 
	private int length; 
	
	public LinkedList() {
		length = 0;
	}
	
	// Returns: Pointer to the first Node in the list where Node.getData().equals(data)
	// O(N)
	public Node<Type> find(Type data) {
		Node<Type> currentNode = head; 
		while(currentNode != null) {
			if(currentNode.getData().equals(data)) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		
		return null;
	}
	
	
	// Returns: the length of the list
	// O(1) 
	public int getLength() {
		return length; 
	}
	
	// Create a node with data and add it to the front of the list
	// O(1)
	public void addAtHead(Type data) {
		Node<Type> newHead = new Node<Type>(data);
		newHead.setNextNode(this.head);
		this.head = newHead;
		length += 1;
	}
	
	// Delete the head node (garbage collection)
	// O(1)
	public void deleteHead(){
		if(this.head != null) {
			this.head = this.head.getNextNode();
			length -= 1; 			
		}
	}
	
	// Print out the node using node.toString
	// Eg. { node1.toString() , node2.toString() , node3.toString() }
	// O(N)
	@Override
	public String toString(){
		String result = "{";
		Node<Type> currentNode = this.head; 
		while(currentNode != null) {
			result += " " + currentNode.toString() + " ";
			currentNode = currentNode.getNextNode();
			if(currentNode != null) {
				result += ", ";
			}
			
		}
		
		result += "}";
		
		return result;
	}
}