import java.util.*;
public class LibraryManagementSystem {
    static class Book{ String title; Book(String t){this.title=t;} public String toString(){return title;} }
    public static void main(String[] args){
        List<Book> totalBooks = new ArrayList<>();
        Set<String> memberIds = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();
        totalBooks.add(new Book("Java Basics"));
        memberIds.add("M1");
        issueQueue.add(totalBooks.get(0));
        // issue
        Book b = issueQueue.poll();
        System.out.println("Issued " + b);
        returnedStack.push(b);
        // re-issue most recent returned
        if(!returnedStack.isEmpty()){
            Book recent = returnedStack.pop();
            System.out.println("Re-issuing " + recent);
        }
    }
}
