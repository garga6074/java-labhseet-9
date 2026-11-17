package lab09.collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Exercise21PriorityQueueAddPrint {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.addAll(Arrays.asList(40, 10, 30, 20));
        System.out.println("PriorityQueue display (iteration order is not guaranteed): " + queue);
        System.out.println("Head element: " + queue.peek());
    }
}
