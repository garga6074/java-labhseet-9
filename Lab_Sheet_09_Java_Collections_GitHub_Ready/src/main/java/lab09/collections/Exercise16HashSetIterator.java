package lab09.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class Exercise16HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<Integer>(Arrays.asList(11, 22, 33, 44));
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
