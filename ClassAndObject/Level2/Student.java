class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student("Sonam", 101, 88);
        s.display();
    }
}