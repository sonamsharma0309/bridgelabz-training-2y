import java.util.*;
public class CollegeAdmissionSystem {
    static class Student implements Comparable<Student>{ String id; double marks; Student(String id,double m){this.id=id;this.marks=m;} public int hashCode(){return id.hashCode();} public boolean equals(Object o){return o instanceof Student && ((Student)o).id.equals(id);} public int compareTo(Student s){ return Double.compare(s.marks,this.marks);} public String toString(){return id+":"+marks;} }
    public static void main(String[] args){
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("S1",85.5));
        Set<Student> shortlisted = new HashSet<>();
        shortlisted.add(applicants.get(0));
        Queue<Student> interviews = new LinkedList<>(shortlisted);
        TreeSet<Student> merit = new TreeSet<>();
        merit.add(new Student("S1",85.5));
        System.out.println("Merit list: " + merit);
    }
}
