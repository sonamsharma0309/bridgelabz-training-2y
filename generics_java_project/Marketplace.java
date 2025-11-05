
package com.example.generics;
public class Marketplace {
    public static <T extends Product> void applyDiscount(T product, double percentage){
        // very simple demonstration: reflectively reduce price not available; so just print
        System.out.println("Applying " + percentage + "% discount to " + product);
    }
}
