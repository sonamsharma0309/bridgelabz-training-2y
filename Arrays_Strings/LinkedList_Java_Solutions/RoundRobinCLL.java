
class Process{
    int id,burst;
    Process next;

    Process(int i,int b){
        id=i;burst=b;
    }
}

public class RoundRobinCLL{
    static Process head=null;

    static void add(int i,int b){
        Process p=new Process(i,b);
        if(head==null){
            head=p;
            p.next=head;
            return;
        }
        Process t=head;
        while(t.next!=head) t=t.next;
        t.next=p;
        p.next=head;
    }

    public static void main(String[] args){
        add(1,5);
        add(2,3);
        System.out.println("Processes added (Round Robin demo)");
    }
}
