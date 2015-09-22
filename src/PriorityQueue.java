public class PriorityQueue {

    private Heap heap;

    public PriorityQueue(int initialSize) {
        heap = new Heap(initialSize);
    }

    public PriorityQueue(int [] list) {
        heap = new Heap(list);
    }

    public void enQueue(int data) {
        heap.add(data);
    }

    public int deQueue() {
        return heap.pop();
    }

    public int peek() {
        return heap.peek();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
