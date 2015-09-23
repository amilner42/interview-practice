import java.util.EmptyStackException;

public class StackQueueDemo {

    public static void main(String[] args) {
        StackQueue<Integer> sq= new StackQueue<>(new Integer[]{1 , 2 , 3 , 4 , 5 , 6, 7, 8, 9 , 10});
        while(!sq.isEmpty()) {
            System.out.println(sq.dequeue());
        }

        try {
            sq.dequeue();
        } catch (EmptyStackException E) {
            System.out.println("Good, it should throw this exception");
        }

        sq.enqueue(1);
        sq.enqueue(2);

        System.out.println(sq.dequeue());
        System.out.println(sq.dequeue());

        System.out.println("Shoud print true: " + sq.isEmpty());
    }
}
