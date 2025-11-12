import java.util.*;
public class CustomerFeedbackAnalysis {
    public static void main(String[] args){
        List<String> allFeedback = new ArrayList<>();
        allFeedback.add("Good");
        allFeedback.add("Good"); // duplicate
        Set<String> unique = new LinkedHashSet<>(allFeedback);
        Queue<String> process = new LinkedList<>(unique);
        Stack<String> recent = new Stack<>();
        while(!process.isEmpty()){
            String f = process.poll();
            System.out.println("Processing: " + f);
            recent.push(f);
        }
        // show last few
        while(!recent.isEmpty()) System.out.println("Recent: " + recent.pop());
    }
}
