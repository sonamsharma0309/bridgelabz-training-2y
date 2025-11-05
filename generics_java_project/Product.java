
package com.example.generics;
public class Product {
    private String name;
    private double price;
    public Product(String name, double price){ this.name = name; this.price = price; }
    public double getPrice(){ return price; }
    public String toString(){ return getClass().getSimpleName()+"("+name+":"+price+")"; }
}
