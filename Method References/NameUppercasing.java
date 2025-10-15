import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("sonam", "rahul", "meena", "arjun");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase) // Method reference
                                           .collect(Collectors.toList());

        System.out.println("Uppercase Employee Names:");
        upperNames.forEach(System.out::println);
    }
}
