package lab09.collections;
import java.util.TreeSet;
import java.util.Arrays;

public class Exercise17TreeSetSort {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(50, 10, 40, 20, 30));
        System.out.println("TreeSet sorted in ascending order: " + numbers);
    }
}
