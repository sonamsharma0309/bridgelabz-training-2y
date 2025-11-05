
package com.example.generics;
public class Vehicle {
    private String id;
    public Vehicle(String id){ this.id = id; }
    public String getId(){ return id; }
    public String toString(){ return getClass().getSimpleName()+"["+id+"]"; }
}
