
package com.example.generics;
public class Fruit {
    private String name;
    public Fruit(String name){ this.name = name; }
    public String getName(){ return name; }
    public String toString(){ return getClass().getSimpleName()+": "+name; }
}
