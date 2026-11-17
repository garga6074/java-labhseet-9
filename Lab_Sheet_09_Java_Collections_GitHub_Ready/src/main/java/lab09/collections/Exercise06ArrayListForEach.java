package lab09.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<String>(Arrays.asList("Java", "Python", "DBMS"));
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}
