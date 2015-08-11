
public class Node<Type> {
	
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
