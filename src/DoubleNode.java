
public class DoubleNode<Type> {
	
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
