
class Movie{
    String title,director;
    int year;
    double rating;
    Movie next,prev;

    Movie(String t,String d,int y,double r){
        title=t;director=d;year=y;rating=r;
    }
}

public class MovieDLL{
    static Movie head=null,tail=null;

    static void addEnd(String t,String d,int y,double r){
        Movie m=new Movie(t,d,y,r);
        if(head==null){head=tail=m;return;}
        tail.next=m;
        m.prev=tail;
        tail=m;
    }

    static void displayForward(){
        Movie t=head;
        while(t!=null){
            System.out.println(t.title+" "+t.director+" "+t.rating);
            t=t.next;
        }
    }

    static void displayReverse(){
        Movie t=tail;
        while(t!=null){
            System.out.println(t.title+" "+t.director+" "+t.rating);
            t=t.prev;
        }
    }

    static void updateRating(String title,double r){
        Movie t=head;
        while(t!=null){
            if(t.title.equals(title)){ t.rating=r; return;}
            t=t.next;
        }
    }

    public static void main(String[] args){
        addEnd("Inception","Nolan",2010,9);
        addEnd("Interstellar","Nolan",2014,8.5);
        displayForward();
        updateRating("Interstellar",9);
        displayReverse();
    }
}
