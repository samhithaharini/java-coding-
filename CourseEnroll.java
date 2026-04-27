class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Course {
    private String title;
    public Course(String title) {
        this.title = title;
    }
    public void enrollStudent(Student student) {
        System.out.println("Student " + student.getName() + " with ID " + student.getId() + " has been enrolled in the course: " + this.title);
    }
}

public class CourseEnroll {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101);
        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(student1);

        Student student2 = new Student("Alice", 102);
        Course physicsCourse = new Course("Physics");
        physicsCourse.enrollStudent(student2);

        Student student3 = new Student("Bob", 103);
        Course csCourse = new Course("Computer Science");
        csCourse.enrollStudent(student3);
    }
}
