
public class DoubleLinkedList<Type> {
	
	private DoubleNode<Type> head; 
	private int length; 
	
	public DoubleLinkedList(){
		 length = 0; 
	}
	
	// Delete the head node
	// O(1)
	public void deleteHead() {
		if(this.head != null) {
			head = head.getNextNode();
			length--;
			if(head != null) {
				head.setPrevNode(null);
			}
		}
	}
	
	// Add Node with data to front of the list
	// O(1)
	public void addAtHead(Type data) {
		DoubleNode<Type> newHead = new DoubleNode<Type>(data);
		newHead.setNextNode(head);
		head = newHead;
		
		if(head.getNextNode() != null) {
			head.getNextNode().setPrevNode(head);
		}
		
		length++;	
	}
	
	// O(1)
	public int length() {
		return length; 
	}
	
	@Override
	public String toString() {
		String result = "{";
		DoubleNode<Type> currentNode = this.head; 
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
