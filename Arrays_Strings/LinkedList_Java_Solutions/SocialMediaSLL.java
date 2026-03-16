
import java.util.*;

class User{
    int id,age;
    String name;
    ArrayList<Integer> friends=new ArrayList<>();
    User next;

    User(int i,String n,int a){
        id=i;name=n;age=a;
    }
}

public class SocialMediaSLL{
    static User head=null;

    static void addUser(int i,String n,int a){
        User u=new User(i,n,a);
        u.next=head;
        head=u;
    }

    static void addFriend(int u1,int u2){
        User t=head;
        while(t!=null){
            if(t.id==u1) t.friends.add(u2);
            if(t.id==u2) t.friends.add(u1);
            t=t.next;
        }
    }

    public static void main(String[] args){
        addUser(1,"Aman",20);
        addUser(2,"Rohit",21);
        addFriend(1,2);
        System.out.println("Friend connection added");
    }
}
