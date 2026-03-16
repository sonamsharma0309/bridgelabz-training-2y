
class Book{
    String title,author,genre,status;
    int id;
    Book next,prev;

    Book(int i,String t,String a,String g,String s){
        id=i;title=t;author=a;genre=g;status=s;
    }
}

public class LibraryDLL{
    static Book head=null,tail=null;

    static void addEnd(int i,String t,String a,String g,String s){
        Book b=new Book(i,t,a,g,s);
        if(head==null){head=tail=b;return;}
        tail.next=b;
        b.prev=tail;
        tail=b;
    }

    static int count(){
        int c=0;
        Book t=head;
        while(t!=null){c++;t=t.next;}
        return c;
    }

    public static void main(String[] args){
        addEnd(1,"Java","James","Tech","Available");
        addEnd(2,"DSA","CLRS","Tech","Issued");
        System.out.println("Books="+count());
    }
}
