package lab09.collections;
import java.util.TreeSet;
import java.util.Arrays;

public class Exercise18TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(10, 20, 30, 40));
        int searchValue = 30;
        System.out.println("Contains " + searchValue + "? " + numbers.contains(searchValue));
    }
}
