package dataStructures;

import exceptions.EmptyLinkedListException;
import sun.invoke.empty.Empty;

class Node<Type> {

	private Type data;
	private Node<Type> nextNode;

	public Node(Type data) {
		this.data = data;
	}

	public void setData(Type data) {
		this.data = data;
	}

	public Type getData(){
		return data;
	}

	public void setNextNode(Node<Type> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<Type> getNextNode() {
		return nextNode;
	}

	@Override
	public String toString(){
		return "Data: " + this.data;
	}
}

public class LinkedList<Type> {
	
	private Node<Type> head; 
	private int length; 
	
	public LinkedList() {
		length = 0;
	}
	
	// Returns: Pointer to the first dataStructures.Node in the list where dataStructures.Node.getData().equals(data)
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
	public void addDataAtHead(Type data) {
		Node<Type> newHead = new Node<Type>(data);
		newHead.setNextNode(this.head);
		this.head = newHead;
		length += 1;
	}

    // Add a node to the front of this list
    public void addNodeAtHead(Node<Type> nextNode) {
        nextNode.setNextNode(head);
        head = nextNode;
    }
	
	// Delete the head node (garbage collection)
	// O(1)
	public Node<Type> deleteHead() throws EmptyLinkedListException{
		if(this.head != null) {
			Node<Type> temp = this.head;
			this.head = this.head.getNextNode();
			length -= 1;
			return temp;
		} else {
			throw new EmptyLinkedListException("Empty list, cannot delete");
		}
	}

    // Modifies: this
    // Effects: Reverse the linked list
    public void reverse() {
        Node<Type> rememberMe = head.getNextNode();
        head.setNextNode(null);                     // this line is key, the front of the new list should point to null

        while(rememberMe != null) {
            Node<Type> temp = head;
            head = rememberMe;
            rememberMe = head.getNextNode();
            head.setNextNode(temp);
        }
    }

	// Explanation: What is cool about this solution is that it takes O(1) memory! Read this solution
	// and make sure it makes sense to you
	public boolean cyclic() {
		if(head == null) {
			return false;
		}
		Node<Type> slowPointer = head;
		Node<Type> fastPointer = head;

		while(true) {
			for(int i = 0; i < 2; i++) {
				fastPointer = fastPointer.getNextNode();
				if(fastPointer == null) {
					return false;
				} else if(fastPointer == slowPointer) {
					return true;
				}
			}
			slowPointer = slowPointer.getNextNode();
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
