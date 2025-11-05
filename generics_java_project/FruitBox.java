
package com.example.generics;
import java.util.*;
public class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void add(T f){ fruits.add(f); }
    public void display(){ for(T f: fruits) System.out.println(f); }
}
