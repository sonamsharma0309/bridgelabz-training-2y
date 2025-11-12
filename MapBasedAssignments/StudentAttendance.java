import java.util.*;

public class StudentAttendance {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        for (String s : students) attendance.put(s, 0);
        
        Random rand = new Random();
        for (int day = 1; day <= 15; day++) {
            for (String s : students) {
                if (rand.nextBoolean()) attendance.put(s, attendance.get(s) + 1);
            }
        }
        
        System.out.println("Under-attending students (<10 days):");
        for (Map.Entry<String, Integer> e : attendance.entrySet())
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " -> " + e.getValue());
    }
}