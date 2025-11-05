
package com.example.generics;
import java.util.*;
public class Meal<T extends MealPlan> {
    private List<T> plans = new ArrayList<>();
    public void add(T p){ plans.add(p); }
    public void show(){ for(T p: plans) System.out.println(p); }
    public static <T extends MealPlan> boolean validate(T p){ return p!=null; }
}
