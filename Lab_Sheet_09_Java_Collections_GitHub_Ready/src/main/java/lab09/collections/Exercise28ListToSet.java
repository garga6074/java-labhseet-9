package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise28ListToSet {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<String>(Arrays.asList("Java", "Python", "Java", "C++", "Python"));
        Set<String> set = new LinkedHashSet<String>(list);
        System.out.println("Original list: " + list);
        System.out.println("Set after duplicate removal: " + set);
    }
}
