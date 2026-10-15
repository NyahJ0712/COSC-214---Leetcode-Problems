import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
    public static void main(String[] args) {
        // 1. Create a Queue using Deque and ArrayDeque
        Deque<String> queue = new ArrayDeque<>();

        // 2. Add 5 strings to the queue
        queue.offer("Alpha");
        queue.offer("Bravo");
        queue.offer("Charlie");
        queue.offer("Delta");
        queue.offer("Echo");

        System.out.println("Printing strings from the Queue (FIFO order):");

        // 3. Print the strings using a while loop by polling them
        while (!queue.isEmpty()) {
            String item = queue.poll();
            System.out.println(item);
        }
    }
}
