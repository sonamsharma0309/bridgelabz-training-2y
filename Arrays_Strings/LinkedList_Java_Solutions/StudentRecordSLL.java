
import java.util.*;

class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int roll,String name,int age,String grade){
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}

public class StudentRecordSLL {
    static Student head=null;

    static void addEnd(int r,String n,int a,String g){
        Student s=new Student(r,n,a,g);
        if(head==null){ head=s; return;}
        Student temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=s;
    }

    static void delete(int roll){
        if(head==null) return;
        if(head.roll==roll){ head=head.next; return;}
        Student temp=head;
        while(temp.next!=null && temp.next.roll!=roll) temp=temp.next;
        if(temp.next!=null) temp.next=temp.next.next;
    }

    static void search(int roll){
        Student t=head;
        while(t!=null){
            if(t.roll==roll){
                System.out.println("Found: "+t.name+" Grade:"+t.grade);
                return;
            }
            t=t.next;
        }
        System.out.println("Not found");
    }

    static void display(){
        Student t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }

    static void updateGrade(int roll,String g){
        Student t=head;
        while(t!=null){
            if(t.roll==roll){
                t.grade=g;
                return;
            }
            t=t.next;
        }
    }

    public static void main(String[] args){
        addEnd(1,"Aman",20,"A");
        addEnd(2,"Rohit",21,"B");
        display();
        updateGrade(2,"A");
        search(2);
        delete(1);
        display();
    }
}
