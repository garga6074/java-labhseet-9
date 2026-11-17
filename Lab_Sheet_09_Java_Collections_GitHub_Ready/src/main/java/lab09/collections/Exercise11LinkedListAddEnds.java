package lab09.collections;
import java.util.LinkedList;

public class Exercise11LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<String>();
        tasks.add("Middle");
        tasks.addFirst("Beginning");
        tasks.addLast("End");
        System.out.println(tasks);
    }
}
