package dataStructures;

public class HeapDemo {

    // Have fun here and play around with the heap!
    public static void main(String[]args) {
        Heap heap1 = new Heap(100);
        heap1.add(1);
        heap1.add(2);
        heap1.add(3);
        heap1.add(4);
        heap1.add(5);
        System.out.println(heap1.toString());

        Heap heap2 = new Heap(new int[]{1 , 2 , 3 , 4 , 5 , 6 , 7, 8 , 9 , 10});
        System.out.println(heap2.toString());
        for(int i = 0 , startingSize = heap2.size(); i < startingSize; i++) {
           heap2.pop();
           System.out.println(heap2.toString());
        }

        Heap heap3 = new Heap(new int[]{1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10});
        System.out.println("Should print false: " + heap3.delete(20));
        heap3.delete(3);
        System.out.println(heap3.toString());
        heap3.delete(5);
        System.out.println(heap3.toString());

        System.out.println(heap3.peek());
        System.out.println(heap3.peek());
        System.out.println("Should print false: " + heap3.isEmpty());
    }
}
