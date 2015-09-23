
public class QueueDemo {
	
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		System.out.println(queue.isEmpty());
		System.out.println(queue.toString());
		
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(10);
		
		System.out.println(queue.toString());
		System.out.println(queue.toString());
		
		queue.enqueue(12);
		
		System.out.println(queue.toString());
		System.out.println(queue.isFull());
		
		try {
			queue.enqueue(15);
		} catch (Error e) {
			System.out.println(e);
		}
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.dequeue();
		
		try {
			queue.dequeue();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(queue.toString());
		
		queue.enqueue(5);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.toString());
	}

}
