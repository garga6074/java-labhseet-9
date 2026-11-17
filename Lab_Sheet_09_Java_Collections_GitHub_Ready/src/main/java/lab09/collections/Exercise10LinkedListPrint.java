package lab09.collections;
import java.util.LinkedList;
import java.util.Arrays;

public class Exercise10LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>(Arrays.asList("Roorkee", "Haridwar", "Dehradun"));
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
