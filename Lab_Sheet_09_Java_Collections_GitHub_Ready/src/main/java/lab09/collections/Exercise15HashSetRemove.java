package lab09.collections;
import java.util.HashSet;
import java.util.Arrays;

public class Exercise15HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>(Arrays.asList("Apple", "Banana", "Mango"));
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}
