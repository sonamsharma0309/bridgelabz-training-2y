
package com.example.generics;
public class VegetarianMeal implements MealPlan {
    private String name;
    public VegetarianMeal(String name){ this.name = name; }
    public String toString(){ return "Vegetarian("+name+")"; }
}
