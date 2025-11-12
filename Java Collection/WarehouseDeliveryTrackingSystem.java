import java.util.*;
public class WarehouseDeliveryTrackingSystem {
    static class PackageItem{ String id; PackageItem(String id){this.id=id;} public String toString(){return id;} }
    public static void main(String[] args){
        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();
        PackageItem p = new PackageItem("PK1");
        if(packageIds.add(p.id)) pending.add(p);
        // process
        while(!pending.isEmpty()){
            PackageItem pk = pending.poll();
            delivered.add(pk);
        }
        System.out.println("Delivered: " + delivered);
    }
}
