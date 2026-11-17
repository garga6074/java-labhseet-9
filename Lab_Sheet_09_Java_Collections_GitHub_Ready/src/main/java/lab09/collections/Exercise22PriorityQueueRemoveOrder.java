package lab09.collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Exercise22PriorityQueueRemoveOrder {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Arrays.asList(40, 10, 30, 20));
        System.out.print("Removal order: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
