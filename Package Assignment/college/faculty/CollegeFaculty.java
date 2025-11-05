
package college.faculty;
public class CollegeFaculty {
    private String name; private String subject;
    public CollegeFaculty(String name, String subject){ this.name=name; this.subject=subject; }
    public void display(){ System.out.println("Faculty: " + name + ", Subject: " + subject); }
}
