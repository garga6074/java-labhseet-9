package lab09.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Arrays;

public class Exercise20CompareSets {
    public static void main(String[] args) {
        Integer[] input = {40, 10, 30, 20, 10, 50};

        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(input));
        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<Integer>(Arrays.asList(input));
        TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(input));

        System.out.println("HashSet (order unspecified): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
