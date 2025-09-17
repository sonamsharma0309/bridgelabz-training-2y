class Student {
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;
    private String name, grade;
    private final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 401, "A");
        Student s2 = new Student("Neha", 402, "B");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
