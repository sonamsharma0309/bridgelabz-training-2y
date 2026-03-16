
class State{
    String text;
    State next,prev;
    State(String t){text=t;}
}

public class UndoRedoDLL{
    static State head=null,current=null;

    static void addState(String t){
        State s=new State(t);
        if(head==null){
            head=current=s;
            return;
        }
        current.next=s;
        s.prev=current;
        current=s;
    }

    static void undo(){
        if(current.prev!=null) current=current.prev;
    }

    static void redo(){
        if(current.next!=null) current=current.next;
    }

    public static void main(String[] args){
        addState("Hello");
        addState("Hello World");
        undo();
        System.out.println(current.text);
        redo();
        System.out.println(current.text);
    }
}
