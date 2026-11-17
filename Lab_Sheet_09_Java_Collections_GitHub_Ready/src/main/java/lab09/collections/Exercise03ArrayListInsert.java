package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise03ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 40, 50));
        numbers.add(2, 30);
        System.out.println("After inserting 30 at index 2: " + numbers);
    }
}
