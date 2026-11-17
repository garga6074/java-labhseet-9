package lab09.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise26ArrayListCustomObjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(3, "Riya", 8.8));
        students.add(new Student(1, "Aman", 9.1));
        students.add(new Student(2, "Karan", 8.4));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
