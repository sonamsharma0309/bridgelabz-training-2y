
package com.example.generics;
import java.util.*;
public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void add(T item){ items.add(item); }
    public List<T> getItems(){ return items; }
    public static void displayAll(List<? extends WarehouseItem> list){
        for(WarehouseItem w: list) System.out.println(w);
    }
}
