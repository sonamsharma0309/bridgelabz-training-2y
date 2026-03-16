
class Task{
    int id,priority;
    String name,date;
    Task next;

    Task(int i,String n,int p,String d){
        id=i;name=n;priority=p;date=d;
    }
}

public class CircularTaskScheduler{
    static Task head=null;

    static void addEnd(int id,String n,int p,String d){
        Task t=new Task(id,n,p,d);
        if(head==null){
            head=t;
            t.next=head;
            return;
        }
        Task temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=t;
        t.next=head;
    }

    static void display(){
        if(head==null) return;
        Task t=head;
        do{
            System.out.println(t.id+" "+t.name+" "+t.priority);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        addEnd(1,"Task1",1,"10/4");
        addEnd(2,"Task2",2,"12/4");
        display();
    }
}
