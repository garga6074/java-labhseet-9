package lab09.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Exercise30ClearCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");

        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);

        Queue<String> queue = new LinkedList<String>();
        queue.add("First");
        queue.add("Second");

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List after clear: " + list + ", size=" + list.size());
        System.out.println("Set after clear: " + set + ", size=" + set.size());
        System.out.println("Queue after clear: " + queue + ", size=" + queue.size());
    }
}
