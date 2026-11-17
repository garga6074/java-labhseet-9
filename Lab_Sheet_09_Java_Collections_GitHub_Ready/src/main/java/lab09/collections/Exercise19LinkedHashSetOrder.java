package lab09.collections;
import java.util.LinkedHashSet;

public class Exercise19LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> languages = new LinkedHashSet<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // Duplicate is ignored; insertion order is preserved.
        System.out.println("LinkedHashSet: " + languages);
    }
}
