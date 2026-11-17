package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise09ReverseArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Kotlin"));
        Collections.reverse(words);
        System.out.println("Reversed strings: " + words);
    }
}
