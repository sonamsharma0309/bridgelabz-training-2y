import java.util.*;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();
        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Python Essentials");
        books.put("978-3333333333", "C++ Guide");
        
        // Search by ISBN
        String isbn = "978-2222222222";
        System.out.println("Book: " + books.getOrDefault(isbn, "Book not found"));
        
        // Remove
        books.remove("978-3333333333");
        
        // Print all sorted
        for (Map.Entry<String, String> e : books.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}