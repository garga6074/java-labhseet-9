package lab09.collections;
import java.util.ArrayList;

public class Exercise02ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        System.out.println("Elements: " + names);
        System.out.println("Size: " + names.size());
    }
}
