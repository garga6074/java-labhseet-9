package lab09.collections;
import java.util.HashSet;

public class Exercise14HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        System.out.println("HashSet (duplicates are stored once): " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
