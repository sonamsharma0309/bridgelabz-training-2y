import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("AI201", 52);
        courses.put("ML301", 3);
        courses.put("DS401", 25);
        courses.put("WEB501", 60);
        
        System.out.println("Near full courses:");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() >= 50)
                System.out.println(e.getKey());
        
        System.out.println("Under-subscribed courses:");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() < 5)
                System.out.println(e.getKey());
    }
}