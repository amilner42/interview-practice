
public class QueueDemo {
	
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		System.out.println(queue.isEmpty());
		System.out.println(queue.toString());
		
		queue.enQueue(5);
		queue.enQueue(7);
		queue.enQueue(10);
		
		System.out.println(queue.toString());
		System.out.println(queue.toString());
		
		queue.enQueue(12);
		
		System.out.println(queue.toString());
		System.out.println(queue.isFull());
		
		try {
			queue.enQueue(15);
		} catch (Error e) {
			System.out.println(e);
		}
		
		queue.deQueue();
		queue.deQueue();
		
		System.out.println(queue.toString());
		
		queue.deQueue();
		queue.deQueue();
		
		try {
			queue.deQueue();	
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(queue.toString());
		
		queue.enQueue(5);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.toString());
	}

}
