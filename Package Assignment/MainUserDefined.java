
import college.student.Student;
import college.faculty.Faculty;
public class MainUserDefined {
    public static void main(String[] args){
        Student s = new Student("Sonam", 101);
        Faculty f = new Faculty("Dr. Mehta", "AI");
        s.display();
        f.display();
    }
}
