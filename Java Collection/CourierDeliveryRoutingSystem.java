import java.util.*;
public class CourierDeliveryRoutingSystem {
    static class Parcel{ String id; int priority; Parcel(String id,int p){this.id=id;this.priority=p;} public String toString(){return id+"(p="+priority+")";} }
    public static void main(String[] args){
        PriorityQueue<Parcel> pq = new PriorityQueue<>((a,b)->Integer.compare(b.priority,a.priority));
        Set<String> assigned = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normal = new LinkedList<>();
        Parcel p = new Parcel("P1",5);
        if(assigned.add(p.id)) pq.add(p);
        while(!pq.isEmpty()){
            Parcel top = pq.poll();
            System.out.println("Delivering " + top);
            completed.add(top);
        }
    }
}
