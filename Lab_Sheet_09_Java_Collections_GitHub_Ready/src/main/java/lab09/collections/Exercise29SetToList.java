package lab09.collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercise29SetToList {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Apple");
        set.add("Orange");
        set.add("Mango");

        List<String> list = new ArrayList<String>(set);
        System.out.println("List created from Set:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
