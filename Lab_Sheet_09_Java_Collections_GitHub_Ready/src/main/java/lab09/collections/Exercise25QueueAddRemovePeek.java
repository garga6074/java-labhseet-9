package lab09.collections;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise25QueueAddRemovePeek {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue after adding: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removing: " + queue);
    }
}
