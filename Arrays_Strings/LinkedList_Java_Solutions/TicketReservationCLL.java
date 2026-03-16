
class Ticket{
    int id,seat;
    String name,movie,time;
    Ticket next;

    Ticket(int i,String n,String m,int s,String t){
        id=i;name=n;movie=m;seat=s;time=t;
    }
}

public class TicketReservationCLL{
    static Ticket head=null;

    static void add(int i,String n,String m,int s,String t){
        Ticket tk=new Ticket(i,n,m,s,t);
        if(head==null){
            head=tk;
            tk.next=head;
            return;
        }
        Ticket temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=tk;
        tk.next=head;
    }

    static int count(){
        if(head==null) return 0;
        int c=0;
        Ticket t=head;
        do{
            c++;
            t=t.next;
        }while(t!=head);
        return c;
    }

    public static void main(String[] args){
        add(1,"Aman","Avengers",5,"10AM");
        add(2,"Rohit","Batman",8,"1PM");
        System.out.println("Tickets="+count());
    }
}
