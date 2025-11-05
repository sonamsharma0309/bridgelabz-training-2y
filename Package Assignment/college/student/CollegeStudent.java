
package college.student;
public class CollegeStudent {
    private String name; private int id;
    public CollegeStudent(String name, int id){ this.name=name; this.id=id; }
    public void display(){ System.out.println("Student: " + name + ", ID: " + id); }
}
