
// Self Problem 1: School and Students with Courses (Association and Aggregation)
import java.util.*;

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() { return courseName; }

    public void enrollStudent(Student s) {
        students.add(s);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() { return name; }

    public void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + name + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class Problem4_SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.showStudents();
        s1.showCourses();
        c1.showEnrolledStudents();
    }
}
