
package com.example.generics;
import java.util.*;
public class Cart<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }
    public void displayItems(){ for(T i: items) System.out.println(i); }
}
