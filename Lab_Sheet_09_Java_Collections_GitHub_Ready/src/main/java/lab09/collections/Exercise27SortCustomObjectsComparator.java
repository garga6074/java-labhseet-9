package lab09.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise27SortCustomObjectsComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(3, "Riya", 8.8));
        students.add(new Student(1, "Aman", 9.1));
        students.add(new Student(2, "Karan", 8.4));

        Comparator<Student> byGradeDescending = new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return Double.compare(second.getGrade(), first.getGrade());
            }
        };

        Collections.sort(students, byGradeDescending);
        System.out.println("Students sorted by grade (highest first):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
