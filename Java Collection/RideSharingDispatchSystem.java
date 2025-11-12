import java.util.*;
public class RideSharingDispatchSystem {
    static class RideRequest implements Comparable<RideRequest>{
        String id; int priority;
        RideRequest(String id,int p){this.id=id;this.priority=p;}
        public int compareTo(RideRequest o){ return Integer.compare(this.priority,o.priority); }
        public String toString(){return id+"(p="+priority+")";}
    }
    static class Driver{ String id; Driver(String id){this.id=id;} public String toString(){return id;} public int hashCode(){return id.hashCode();} public boolean equals(Object o){return o instanceof Driver && ((Driver)o).id.equals(id);} }
    static class Ride{ String id; Ride(String id){this.id=id;} }
    public static void main(String[] args){
        Queue<RideRequest> pending = new LinkedList<>();
        pending.add(new RideRequest("R1",5));
        pending.add(new RideRequest("R2",2));
        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1")); drivers.add(new Driver("D2"));
        List<Ride> completed = new ArrayList<>();
        PriorityQueue<RideRequest> pq = new PriorityQueue<>((a,b)->Integer.compare(a.priority,b.priority)); // lower = higher priority
        pq.add(new RideRequest("R3",1));
        // handle priority first
        while(!pq.isEmpty()){
            RideRequest rr = pq.poll();
            System.out.println("Assigning high-priority " + rr);
        }
    }
}
