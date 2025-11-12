import java.util.*;
public class InventoryRestockManagementSystem {
    static class Product{ String name; double price; int stock; Product(String n,double p,int s){this.name=n;this.price=p;this.stock=s;} public String toString(){return name+":"+stock;} }
    public static void main(String[] args){
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> recentlyRestocked = new Stack<>();
        Product p = new Product("Milk",10.0,2);
        if(productNames.add(p.name)) products.add(p);
        if(p.stock < 5) restockQueue.add(p);
        // process restock
        while(!restockQueue.isEmpty()){
            Product r = restockQueue.poll();
            r.stock += 50;
            recentlyRestocked.push(r);
        }
        // undo recent restock
        if(!recentlyRestocked.isEmpty()){
            Product undo = recentlyRestocked.pop();
            undo.stock -= 50;
        }
    }
}
