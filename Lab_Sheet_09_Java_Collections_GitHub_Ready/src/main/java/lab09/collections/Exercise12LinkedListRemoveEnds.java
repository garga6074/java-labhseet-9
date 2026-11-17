package lab09.collections;
import java.util.LinkedList;
import java.util.Arrays;

public class Exercise12LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>(Arrays.asList(10, 20, 30, 40));
        Integer firstRemoved = numbers.removeFirst();
        Integer lastRemoved = numbers.removeLast();
        System.out.println("Removed first: " + firstRemoved);
        System.out.println("Removed last: " + lastRemoved);
        System.out.println("Remaining: " + numbers);
    }
}
