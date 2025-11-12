import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Sales");
        empDept.put(104, "IT");
        empDept.put(105, "Finance");
        
        empDept.put(105, "HR");
        
        String searchDept = "IT";
        System.out.println("Employees in " + searchDept + ":");
        for (Map.Entry<Integer, String> e : empDept.entrySet())
            if (e.getValue().equals(searchDept))
                System.out.println(e.getKey());
        
        Map<String, Long> count = new HashMap<>();
        empDept.values().forEach(v -> count.put(v, count.getOrDefault(v, 0L) + 1));
        System.out.println("Total employees per department: " + count);
    }
}