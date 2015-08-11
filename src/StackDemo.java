
public class StackDemo {
	
	public static void main(String[]args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(51);
		stack.push(15);
		stack.push(35);
		Integer a = stack.pop();
		
		System.out.println(stack.toString());
		System.out.println(a);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.toString());
		
		stack.push(10);
		stack.push(15);
		
		System.out.println(stack.toString());
		System.out.println(stack.peek());
	}

}
