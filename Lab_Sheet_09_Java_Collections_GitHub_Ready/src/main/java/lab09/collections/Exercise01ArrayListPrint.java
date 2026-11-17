package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        System.out.println("ArrayList elements: " + numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
