package lab09.collections;
import java.util.LinkedList;
import java.util.Arrays;

public class Exercise13LinkedListRetrieveEnds {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<String>(Arrays.asList("Pen", "Book", "Bag"));
        System.out.println("First: " + items.getFirst());
        System.out.println("Last: " + items.getLast());
        System.out.println("Original list remains: " + items);
    }
}
