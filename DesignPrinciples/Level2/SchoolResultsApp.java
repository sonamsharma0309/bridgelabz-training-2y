import java.util.*;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }
}

class GradeCalculator {
    static String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.subjects) {
            total += s.marks;
        }
        double avg = (double) total / student.subjects.size();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.addSubject("Maths", 98);
        s1.addSubject("Science", 85);

        String grade = GradeCalculator.calculateGrade(s1);

        System.out.println("Student: " + s1.name);
        for (Subject sub : s1.subjects) {
            System.out.println(sub.name + ": " + sub.marks);
        }
        System.out.println("Grade: " + grade);
    }
}
