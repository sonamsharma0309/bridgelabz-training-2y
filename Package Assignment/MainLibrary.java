
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainLibrary {
    public static void main(String[] args){
        Book b = new Book("Java Basics", "Herbert Schildt");
        Member m = new Member("Sonam", 2025);
        Transaction t = new Transaction();
        b.display(); m.display(); t.issue(b,m);
    }
}
