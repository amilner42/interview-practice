public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue(100);
        pq1.enqueue(10);
        pq1.enqueue(7);
        pq1.enqueue(14);

        while(!pq1.isEmpty()) {
            System.out.println(pq1.dequeue());
        }

        PriorityQueue pq2 = new PriorityQueue(new int[]{1 , 2 , 3, 7 , 6 ,5 , 4 , 3 , 3 , 3});
        while(!pq2.isEmpty()) {
            System.out.println(pq2.dequeue());
        }
    }
}
