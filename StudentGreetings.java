import java.util.ArrayList;
import java.util.Arrays;

public class StudentGreetings {

    public static void main(String[] args) {
        ArrayList<String> students1 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));
        greetStudents(students1);
        ArrayList<String> students2 = new ArrayList<>();
        greetStudents(students2);
        ArrayList<String> students3 = new ArrayList<>(Arrays.asList("John"));
        greetStudents(students3);
        ArrayList<String> students4 = new ArrayList<>(Arrays.asList("Anna-Maria", "Joe123", "Sam@Home"));
        greetStudents(students4);
        ArrayList<String> students5 = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            students5.add("Student" + i);
        }
        greetStudents(students5);
    }

    public static void greetStudents(ArrayList<String> students) {
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }
}
