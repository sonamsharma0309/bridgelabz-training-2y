
class Item{
    int id,qty;
    String name;
    double price;
    Item next;

    Item(int i,String n,int q,double p){
        id=i;name=n;qty=q;price=p;
    }
}

public class InventorySLL{
    static Item head=null;

    static void addEnd(int i,String n,int q,double p){
        Item it=new Item(i,n,q,p);
        if(head==null){head=it;return;}
        Item t=head;
        while(t.next!=null) t=t.next;
        t.next=it;
    }

    static double totalValue(){
        double sum=0;
        Item t=head;
        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }
        return sum;
    }

    public static void main(String[] args){
        addEnd(1,"Pen",10,5);
        addEnd(2,"Book",5,50);
        System.out.println("Total value="+totalValue());
    }
}
