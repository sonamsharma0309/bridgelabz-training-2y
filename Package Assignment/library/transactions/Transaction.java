
package library.transactions;
import library.books.Book;
import library.members.Member;
public class Transaction {
    public void issue(Book b, Member m){
        System.out.println(m.getClass().getSimpleName()+" issued "+b.getClass().getSimpleName());
    }
}
