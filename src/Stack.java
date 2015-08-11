import java.util.ArrayList;


public class Stack<Type> {
	
	private ArrayList<Type> array;
	private int top; 
	
	public Stack() {
		array = new ArrayList<Type>();
		top = -1; 
	}
	
	// Returns: null if the stack is empty, otherwise the top of the stack
	// Modifies: this
	// O(1)
	public Type pop() {
		if(array.isEmpty()) {
			return null; 
		} else {
			return array.remove(top--);
		}
	}	
	
	// Modifies: this
	// O(1)
	public void push(Type data) {
		array.add(data);
		top++; 
	}
	
	// Returns: the element on top
	// Modifies: nothing
	// O(1) 
	public Type peek() {
		if(array.isEmpty()) {
			return null; 
		} else {
			return array.get(top);			
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		int topTemp = top;
		
		while(topTemp >= 0) {
			result += array.get(topTemp--) + " ";
		}
		
		return result; 
	}
}
