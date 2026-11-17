package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise07ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 10, 15, 20));
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
