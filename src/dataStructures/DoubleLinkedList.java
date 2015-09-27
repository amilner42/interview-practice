package dataStructures;

import exceptions.EmptyLinkedListException;

class DoubleNode<Type> {

	private Type data;
	private DoubleNode<Type> nextNode;
	private DoubleNode<Type> prevNode;

	public DoubleNode(Type data) {
		this.data = data;
	}

	public void setNextNode(DoubleNode<Type> nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleNode<Type> getNextNode() {
		return nextNode;
	}

	public void setPrevNode(DoubleNode<Type> prevNode) {
		this.prevNode = prevNode;
	}

	public DoubleNode<Type> getPrevNode() {
		return prevNode;
	}

	@Override
	public String toString() {
		return "Data: " + this.data;
	}

}

public class DoubleLinkedList<Type> {
	
	private DoubleNode<Type> head; 
	private int length; 
	
	public DoubleLinkedList(){
		 length = 0; 
	}
	
	// Delete the head node
	// O(1)
	public DoubleNode<Type> deleteHead() throws EmptyLinkedListException {
		if(this.head != null) {
			DoubleNode<Type> temp = this.head;
			head = head.getNextNode();
			length--;
			if (head != null) {
				head.setPrevNode(null);
			}
			return temp;
		} else {
			throw new EmptyLinkedListException("Can't delete() on empty list");
		}
	}
	
	// Add dataStructures.Node with data to front of the list
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
