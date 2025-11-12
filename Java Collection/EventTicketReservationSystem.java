import java.util.*;
public class EventTicketReservationSystem {
    static class Booking{ String id; boolean vip; Booking(String id,boolean vip){this.id=id;this.vip=vip;} public String toString(){return id+(vip?":VIP":"");} }
    public static void main(String[] args){
        List<Booking> bookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> confirmQueue = new LinkedList<>();
        PriorityQueue<Booking> vipPQ = new PriorityQueue<>((a,b)-> Boolean.compare(b.vip,a.vip));
        users.add("U1");
        Booking b1 = new Booking("B1",true);
        bookings.add(b1); confirmQueue.add(b1); vipPQ.add(b1);
        // prioritize VIPs
        while(!vipPQ.isEmpty()){
            Booking bk = vipPQ.poll();
            System.out.println("Confirming " + bk);
        }
    }
}
