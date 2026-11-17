package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise08ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(50, 10, 40, 20, 30));
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);
    }
}
