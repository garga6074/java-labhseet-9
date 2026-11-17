package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise05ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Red", "Green", "Blue"));
        colors.set(1, "Yellow");
        System.out.println("Updated list: " + colors);
    }
}
