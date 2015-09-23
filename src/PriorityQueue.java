public class PriorityQueue {

    private Heap heap;

    public PriorityQueue(int initialSize) {
        heap = new Heap(initialSize);
    }

    public PriorityQueue(int [] list) {
        heap = new Heap(list);
    }

    public void enqueue(int data) {
        heap.add(data);
    }

    public int dequeue() {
        return heap.pop();
    }

    public int peek() {
        return heap.peek();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
