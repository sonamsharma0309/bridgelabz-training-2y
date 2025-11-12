import java.util.*;
public class OnlineExaminationManagementSystem {
    static class Question{ String q; Question(String q){this.q=q;} public String toString(){return q;} }
    static class Student{ String id; Student(String id){this.id=id;} public String toString(){return id;} }
    public static void main(String[] args){
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        // Randomize
        Collections.shuffle(questions);
        // Unique student IDs
        Set<String> studentIds = new HashSet<>();
        studentIds.add("S1"); studentIds.add("S2"); studentIds.add("S1"); // duplicate ignored
        // Queue of students
        Queue<Student> waiting = new LinkedList<>();
        waiting.add(new Student("S1")); waiting.add(new Student("S2"));
        // Stack for question navigation
        Stack<Question> nav = new Stack<>();
        nav.push(questions.get(0));
        nav.push(questions.get(1));
        // serve students
        while(!waiting.isEmpty()){
            Student s = waiting.poll();
            System.out.println("Serving " + s);
        }
    }
}
