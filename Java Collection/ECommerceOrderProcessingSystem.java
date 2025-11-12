import java.util.*;
public class ECommerceOrderProcessingSystem {
    static class Order {
        String id; String details;
        Order(String id, String d){this.id=id;this.details=d;}
        public boolean equals(Object o){
            return o instanceof Order && ((Order)o).id.equals(id);
        }
        public int hashCode(){ return id.hashCode(); }
        public String toString(){ return "Order("+id+","+details+")"; }
    }
    public static void main(String[] args){
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order("O1","itemA"));
        allOrders.add(new Order("O2","itemB"));
        allOrders.add(new Order("O1","itemA-duplicate"));

        // Remove duplicates using HashSet
        Set<Order> unique = new LinkedHashSet<>(allOrders);
        // Process orders FIFO using Queue
        Queue<Order> processingQueue = new LinkedList<>(unique);
        // Stack for failed orders
        Stack<Order> failed = new Stack<>();

        while(!processingQueue.isEmpty()){
            Order o = processingQueue.poll();
            System.out.println("Processing "+o);
            // simulate random failure
            if(o.id.equals("O2")){
                System.out.println("Failed: " + o);
                failed.push(o);
            }
        }

        // Re-process failed orders
        while(!failed.isEmpty()){
            Order r = failed.pop();
            System.out.println("Retrying " + r);
        }
    }
}
