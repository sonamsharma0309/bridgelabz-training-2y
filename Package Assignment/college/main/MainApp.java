
package college.main;
import college.student.*; import college.faculty.*; import college.department.*;
public class MainApp {
    public static void main(String[] args){
        CollegeStudent s = new CollegeStudent("Sonam", 101);
        CollegeFaculty f = new CollegeFaculty("Dr. Mehta", "AI");
        Department d = new Department("Computer Science");
        s.display(); f.display(); d.display();
    }
}
