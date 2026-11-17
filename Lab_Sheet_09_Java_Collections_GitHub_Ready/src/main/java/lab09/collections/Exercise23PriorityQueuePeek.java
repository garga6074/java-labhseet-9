package lab09.collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Exercise23PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Arrays.asList(30, 10, 20));
        System.out.println("Head: " + queue.peek());
        System.out.println("Queue after peek (unchanged): " + queue);
        System.out.println("Size: " + queue.size());
    }
}
