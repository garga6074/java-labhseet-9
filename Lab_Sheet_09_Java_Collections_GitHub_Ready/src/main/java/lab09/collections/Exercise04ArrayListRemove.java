package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise04ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 20, 40));
        numbers.remove(1); // Remove by index: removes the element at index 1.
        numbers.remove(Integer.valueOf(20)); // Remove by value: removes first matching 20.
        System.out.println("After removing by index and value: " + numbers);
    }
}
